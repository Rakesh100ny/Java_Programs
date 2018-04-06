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

    $scope.getData = readJson.getJson();
    $scope.getData.then(function(response){
      $scope.jsonRecord = response;
    })
  });
