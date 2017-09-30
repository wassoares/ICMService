var appService = angular.module('appService', ['ngRoute']);

appService.config(function ($routeProvider, $locationProvider){
	$routeProvider
	.when("/login", {templateUrl:'view/login.html', controller: 'loginController'})
	.when("/usuarios", {templateUrl:'view/usuario.html', controller: 'usuarioController'})
	.when("/margens", {templateUrl:'view/margem.html', controller: 'margemController'})
	.when("/antecipacao", {templateUrl:'view/antecipacao.html', controller: 'antecipacaoController'})
	.when("/diferencial", {templateUrl:'view/diferencial.html', controller: 'diferencialController'})
	.when("/substituicao", {templateUrl:'view/substituicao.html', controller: 'substituicaoController'})
	.otherwise({rediretTo: '/'});
	
	$locationProvider.html5Mode(true);
});

appService.config(function($httpProvider){
	$httpProvider.interceptors.push("authorizationInterceptor");
});

appService.filter('percentage', ['$filter', function($filter) {
	return function(input, decimals) {
		return $filter('number')(input * 100, decimals) + '%';
	};
}]);