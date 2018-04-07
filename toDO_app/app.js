var app=
angular.module('myApp',['ui.router','ngMaterial','ngMessages','angular.filter']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider)
{
$stateProvider

.state('test',
{
  url         : '/test',
  templateUrl : 'templates/test.html',
  controller  : 'mainController'
})

.state('login',
{
  url         : '/login',
  templateUrl : 'templates/login.html',
  controller  : 'loginCtrl'
})

.state('home',
{
  url         : '/home',
  templateUrl : 'templates/home.html',
  controller  : 'homeCtrl'
})

.state('readJson',
{
  url         : '/readJson',
  templateUrl : 'templates/readingData.html',
  controller  : 'jsonCtrl'
})

.state('home.dashboard',
{
  url         : '/dashboard',
  templateUrl : 'templates/dashboard.html',
  controller  : 'dashboardCtrl'
});
  $urlRouterProvider.otherwise('/login');
}]);
