appService.controller("loginController", function ($scope, $http){
	
	$scope.usuario = {};	
	$scope.token = "";	
	$scope.status = "";
	
	$scope.autenticar = function() {
		$http.post("/autenticar", $scope.usuario).then(function(response){
			console.log("Sucesso " + response);
			$scope.token = response.data.token;
			$scope.status = "Autenticado com Sucesso :D";
			localStorage.setItem("userToken", response.data.token);
		}, function(response){
			console.log("Falha " + response);
			$scope.status = "Autenticação falhou :'(";
		});
		console.log("Chamou autenticar " + $scope.usuario.login + " " + $scope.usuario.senha);
	};
	
});