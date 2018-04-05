var app=angular.module('myApp',['ui.router','ngMaterial','ngMessages']);
app.config(['$stateProvider','$urlRouterProvider',function($stateProvider,$urlRouterProvider)
{
$stateProvider
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

.state('dashboard',
{
  url         : '/dashboard',
  templateUrl : 'templates/dashboard.html',
  controller  : 'dashboardCtrl'
});
  $urlRouterProvider.otherwise('/login');
}]);
