appService.controller('usuarioController', function($scope, $http) {
	
	//$scope.mostrar = true;
	$scope.usuarios = [];
	$scope.usuario = {};

	listar = function() {
		$http({
			method : 'GET',
			url : '/usuarios'
		}).then(function(response) {
			$scope.usuarios = response.data;
			if ($scope.usuarios.length == 0) {
				$scope.mostrar = true;
			} else {
				$scope.mostrar = false;
			}
		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
	};
	
	listar();

	$scope.salvar = function() {
		if ($scope.frmUsuario.$valid) {
			$http({
				method : 'POST',
				url : '/usuarios',
				data : $scope.usuario
			}).then(function(response) {
				listar();
				$scope.cancelar();				
			}, function(response) {
				console.log(response.data);
				console.log(response.status);
			});
		}
	}

	$scope.excluir = function(usuario) {
		$http({
			method : 'DELETE',
			url : '/usuarios/' + usuario.id
		}).then(function(response) {
			posicao = $scope.usuarios.indexOf(usuario);
			$scope.usuarios.splice(posicao, 1);
			if ($scope.usuarios.length == 0) {
				$scope.mostrar = true;
			}
		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
	}

	$scope.cancelar = function() {
		$scope.usuario = {};
	};

	
	
});