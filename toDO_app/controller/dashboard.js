app.controller('dashboardCtrl', function ($scope,readJson,$mdDialog)
{
    $scope.getData = readJson.getJson();
    $scope.getData.then(function(response){
      $scope.jsonRecord = response;
   });
  //  $scope.customFullscreen = false;
   $scope.showDialog = function(event,data) {
    $mdDialog.show({
      locals : {mobileInformation : data},
      controller: DialogCtrl,
      templateUrl: 'templates/mobileDialog.html',
      parent: angular.element(document.body),
      targetEvent: event,
      clickOutsideToClose:true,
      fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
    });

  };
  function DialogCtrl($scope, $mdDialog,mobileInformation) {
     $scope.mobileInformation = mobileInformation;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
  $scope.selectedItems = angular.copy($scope.jsonRecord);
 console.log("$scope.selectedItems");
    $scope.toggle = function (index) {
      if ($scope.jsonRecord[index].selected) {
        $scope.selectedItems.splice(index, 1);
      }
      else {
        $scope.selectedItems.splice(index, 0, $scope.jsonRecord[index]);
      }
    }
  });

app.config(function($mdThemingProvider) {
  $mdThemingProvider.theme('dark-grey').backgroundPalette('grey').dark();
    $mdThemingProvider.theme('dark-orange').backgroundPalette('orange').dark();
    $mdThemingProvider.theme('dark-purple').backgroundPalette('deep-purple').dark();
    $mdThemingProvider.theme('dark-blue').backgroundPalette('blue').dark();
  });
