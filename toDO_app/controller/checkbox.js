app.controller('checkboxCtrl', function($scope,readJson) {

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

    $scope.items = arr;
      $scope.selected = [];

      $scope.toggle = function (item, list) {
        var idx = list.indexOf(item);
        if (idx > -1) {
          list.splice(idx, 1);
        }
        else {
          list.push(item);
        }
      };

      $scope.exists = function (item, list) {
        return list.indexOf(item) > -1;
      };
});
