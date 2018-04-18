app.controller('homeCtrl', function ($scope, $timeout,$mdSidenav,$state,readJson,$filter)
{
  var manufacturerItem = [];
  var storageItem = [];
  var osItem = [];
  var cameraItem = [];

    $scope.toggleLeft = buildToggler('left');

    function buildToggler(componentId) {
       return function() {
         $mdSidenav(componentId).toggle();
         var isOpen = $mdSidenav(componentId).isOpen();
 if (isOpen) {
   document.getElementById('dashboard').style.marginLeft = '320px';
 } else {
   document.getElementById('dashboard').style.marginLeft = '0px';
 }
       };
     }

    
    $scope.sendLogin=function()
    {
     $state.go('login');
    }

    var arr=[];
    $scope.getData = readJson.getJson();
    $scope.getData.then(function(response){
      $scope.jsonRecord = response;
      angular.forEach($scope.jsonRecord, function(value, key) {
    // console.log("VALUE",value.specs.os);
    arr.push(value.specs.os)
    //console.log(arr);
  });
      // console.log("$scope.jsonRecord",$scope.jsonRecord);
    })

     $scope.Manufacturer="manufacturer";
     $scope.Storage="storage";
     $scope.Os="os";
     $scope.Camera="camera";

    $scope.toggle = function(type, value) {
      console.log("type",type);
      console.log("value",value);
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

  });

  app.filter('dispalyCommonItem', function()
  {
   return function(items, arrayManufacturer)
   {
    var filtered = [];
    var temp = [];
    console.log("r1");
    if (items != undefined && arrayManufacturer.length > 0) {
      console.log("r2");
        for (var i = 0; i < items.length; i++)
        {
          console.log("r3");
          var item = items[i];
           console.log("item",item);
          for (var j = 0; j < arrayManufacturer.length; j++) {
            console.log("r4");
            var selectedItem = arrayManufacturer[j];
            if (item.specs.manufacturer == selectedItem) {
              console.log("r5");
              filtered.push(item);
            }
          }
        }
          temp = filtered;
          filtered = [];
    }
   else {
    temp = items;
  }
    return temp;
  };

  return function(items, arrayStorage)
  {
    if (items != undefined && arrayStorage.length > 0) {
      for (var i = 0; i < temp.length; i++) {
        var item = temp[i];

        for (var j = 0; j < arrayStorage.length; j++) {
          var selectedItem = arrayStorage[j];
          if (item.specs.storage == selectedItem ) {
            filtered.push(item);
          }
        }
      }
      temp = filtered;
      filtered = [];
    }
      else {
       temp = items;
     }
       return temp;
     };

  return function(items, arrayStorage)
  {
    if (items != undefined && arrayOs.length > 0) {
      for (var i = 0; i < temp.length; i++) {
        var item = temp[i];

        for (var j = 0; j< arrayOs.length; j++) {
          var selectedItem = arrayOs[j];
          if (item.specs.os == selectedItem) {
            filtered.push(item);
          }
        }
      }
      temp = filtered;
      filtered = [];
      }
      else {
       temp = items;
     }
       return temp;
     };

 return function(items, arrayStorage)
 {
   if (items != undefined && arrayCamera.length > 0) {
     for (var i = 0; i < temp.length; i++) {
       var item = temp[j];

       for (var j = 0; j < arrayCamera.length; j++) {
         var selectedItem = arrayCamera[j];
         if (item.specs.camera == selectedItem) {
           filtered.push(item);
         }
       }

     }
     temp = filtered;
     filtered = [];
   }
   else {
    temp = items;
  }
    return temp;
  };

});
