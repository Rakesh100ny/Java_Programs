app.controller('dashboardCtrl', function ($scope,readJson,$mdDialog)
{
    $scope.getData = readJson.getJson();
    $scope.getData.then(function(response){
      $scope.jsonRecord = response;
   });
   $scope.customFullscreen = false;
   $scope.showAdvanced = function(ev) {
    $mdDialog.show({
      controller: dashboardCtrl,
      templateUrl: 'templates/dashboard.html',
      parent: angular.element(document.body),
      targetEvent: ev,
      clickOutsideToClose:true,
      fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
    })
    .then(function(answer) {
      $scope.status = 'You said the information was "' + answer + '".';
    }, function() {
      $scope.status = 'You cancelled the dialog.';
    });
  };
 });
