app.controller('homeCtrl', function($scope,$rootScope, $timeout, $mdSidenav, $state, readJson, $filter) {
  var manufacturerItem = [];
  var storageItem = [];
  var osItem = [];
  var cameraItem = [];

  $scope.toggleLeft = buildToggler('left');
  $scope.toggleRight = buildToggler('right');

  function buildToggler(componentId) {
    return function() {
      console.log("id",componentId);
      if (componentId=='left') {
         console.log("hii");
         $mdSidenav(componentId).toggle();
         var isOpen = $mdSidenav(componentId).isOpen();
         if (isOpen) {
           document.getElementById('dashboard').style.marginLeft = '320px';
         } else {
           document.getElementById('dashboard').style.marginLeft = '0px';
         }
      } else {
       console.log("hello");
       $mdSidenav(componentId).toggle();
      }

    };
  }

  $rootScope.$on("$locationChangeStart",function(event, next, current){
                    $mdSidenav('left_panel').close();
                });

  $mdSidenav('left', true).then(function(instance) {
    // On close callback to handle close, backdrop click, or escape key pressed.
    // Callback happens BEFORE the close action occurs.
    instance.onClose(function() {
      document.getElementById('dashboard').style.marginLeft = '0px';
    });
  });


  $scope.ArrayTheme = ['Blue', 'Grey', 'Purple', 'Orange'];

  $scope.sendLogin = function() {
    $state.go('login');
  }

  var arr = [];
  $scope.getData = readJson.getJson();
  $scope.getData.then(function(response) {
    $scope.jsonRecord = response;
    angular.forEach($scope.jsonRecord, function(value, key) {
      // console.log("VALUE",value.specs.os);
      arr.push(value.specs.os)
      //console.log(arr);
    });
    // console.log("$scope.jsonRecord",$scope.jsonRecord);
  })

  $scope.Manufacturer = "manufacturer";
  $scope.Storage = "storage";
  $scope.Os = "os";
  $scope.Camera = "camera";

  $state.go('home.dashboard');

 $scope.types = { manufacturer:{},
                 storage:{},
                 os :{},
                 camera:{}
                };

  $scope.toggle = function(type, value) {
    console.log("type", type);
    console.log("value", value);
    switch (type) {
      case 'manufacturer':
        var indexManufacturer = manufacturerItem.indexOf(value);
        if (indexManufacturer > -1) {
          manufacturerItem.splice(indexManufacturer, 1);
        } else {
          manufacturerItem.push(value);
        }
        break;
      case 'storage':
        var indexStorage = storageItem.indexOf(value);
        if (indexStorage > -1) {
          storageItem.splice(indexStorage, 1);
        } else {
          storageItem.push(value);
        }
        break;
      case 'os':
        var indexOs = osItem.indexOf(value);
        if (indexOs > -1) {
          osItem.splice(indexOs, 1);
        } else {
          osItem.push(value);
        }
        break;
      case 'camera':
        var indexCamera = cameraItem.indexOf(value);
        if (indexCamera > -1) {
          cameraItem.splice(indexCamera, 1);
        } else {
          cameraItem.push(value);
        }
        break;
    }
  };
  $scope.arrayManufacturer = manufacturerItem;
  $scope.arrayStorage = storageItem;
  $scope.arrayOs = osItem;
  $scope.arrayCamera = cameraItem;

  // console.log("arrMan",manufacturerItem);
  // console.log("arrSto",storageItem);
  // console.log("arrOs",osItem);
  // console.log("arrCam",cameraItem);
});

app.filter('myFilter', function() {
  return function(items, arrayManufacturer, arrayStorage, arrayOs, arrayCamera) {
    var filtered = [];
    var temparr = [];
    if (items != undefined) {
      if (arrayManufacturer.length > 0 || arrayStorage.length > 0 || arrayOs.length > 0 || arrayCamera.length > 0) {
        for (var j = 0; j < items.length; j++) {
          for (var i = 0; i < arrayManufacturer.length; i++) {
            console.log("items",items[j].specs.manufacturer);
            console.log("array",arrayManufacturer[i]);
            if (items[j].specs.manufacturer == arrayManufacturer[i]) {
              filtered.push(items[j]);
            }
          }
        }
        if (filtered.length > 0) {
          temparr = filtered;
          filtered = [];
        } else {
          temparr = items;
        }
        if (arrayStorage.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            for (var i = 0; i < arrayStorage.length; i++) {
              if (temparr[j].specs.storage == arrayStorage[i]) {
                filtered.push(temparr[j]);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }
        if (arrayOs.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            for (var i = 0; i < arrayOs.length; i++) {
              if (temparr[j].specs.os == arrayOs[i])
               {
                filtered.push(temparr[j]);
               }
            }
          }
          temparr = filtered;
          filtered = [];
        }
        if (arrayCamera.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            for (var i = 0; i < arrayCamera.length; i++) {
              if (temparr[j].specs.camera == arrayCamera[i]) {
                filtered.push(temparr[j]);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }
      } else {
        temparr = items;
      }
    }
    return temparr;
  };
});
