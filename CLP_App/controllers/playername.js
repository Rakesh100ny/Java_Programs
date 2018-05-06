app.controller('Playersinfoctrl', function($scope,readJson, myFactory) {

if (myFactory.getData()=='Delhi Daredevils')
 {
   var arr = [];
   $scope.getData = readJson.getJson("JSON/newPlayerInfo.json");
   $scope.getData.then(function(response) {
   $scope.pInfo = response['Playersinfo'];
   angular.forEach($scope.pInfo, function(value, key) {
   if(value.team_id!=1)
   {
     arr.push(value);
   }
    console.log(arr);
   });
   })
}
else
{
  $scope.getData = readJson.getJson("JSON/newPlayerInfo.json");
  $scope.getData.then(function(response) {
  $scope.pInfo = response['Playersinfo'];

 console.log("galat click kiyaaa...!");

}




});
