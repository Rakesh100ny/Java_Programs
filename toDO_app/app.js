var app =
  angular.module('myApp', ['ui.router', 'ngMaterial', 'ngMessages', 'angular.filter']);
app.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider,$mdThemingProvider) {
  $stateProvider

    .state('test', {
      url: '/test',
      templateUrl: 'templates/test.html',
      controller: 'mainController'
    })

    .state('login', {
      url: '/login',
      templateUrl: 'templates/login.html',
      controller: 'loginCtrl'
    })

    .state('home', {
      url: '/home',
      templateUrl: 'templates/home.html',
      controller: 'homeCtrl'
    })

    .state('checkbox', {
      url: '/checkbox',
      templateUrl: 'templates/filterUsingChechbox.html',
      controller: 'angularController'
    })

    .state('readJson', {
      url: '/readJson',
      templateUrl: 'templates/readingData.html',
      controller: 'jsonCtrl'
    })

    .state('home.dashboard', {
      url: '/dashboard',
      templateUrl: 'templates/dashboard.html',
      controller: 'dashboardCtrl'
    });
  $urlRouterProvider.otherwise('/login');


}]);
