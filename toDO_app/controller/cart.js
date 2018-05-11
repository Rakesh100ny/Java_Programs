app.controller('cartCtrl',function($scope){
  $scope.openCart=function(data){
    $state.go('home.cart');
    console.log("data",data);
    $scope.cart=data;
  };
});
