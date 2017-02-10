(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput' ]).config(
			[ '$routeProvider', function($routeProvider, $urlRouterProvider) {
				
				  $routeProvider
			      .when('/', {
			        templateUrl: 'index.html',
			        controller: 'formationController',
			        controllerAs: 'main'
			      })
			} ]);

}).call(this);
