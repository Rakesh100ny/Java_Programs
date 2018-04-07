app.controller('homeCtrl', function ($scope, $timeout, $mdSidenav,$state,readJson)
{
    $scope.toggleLeft = buildToggler('left');
    $scope.toggleRight = buildToggler('right');

    function buildToggler(componentId) {
      return function() {
        $mdSidenav(componentId).toggle();
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
    console.log(arr);
  });
      // console.log("$scope.jsonRecord",$scope.jsonRecord);
    })
  });
