//No arquivo app.js
//Em $routeProvider
//.when("/margens/:margemId", {templateUrl:'view/margem-detalhe.html', controller: 'margemDetalheController'})

appService.controller("margemDetalheController", function($scope, $routeParams, $http){
	
	$scope.margem = {}
	
	$http.get("margens/"+$routeParams.margemId).then(function (response){
		$scope.margem = response.data;
		
	}, function (response){
		console.log(response);
		
	});
});