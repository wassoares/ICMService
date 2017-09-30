appService.controller('margemController', function($scope, $http) {

	$scope.margens = [];
	$scope.margem = {};

	listar = function() {
		
		//validação de campos com lançamento de alerta!
		/*	
		   if (parseFloat($scope.antecipacao.custoMercadoria.valor)>parseFloat($scope.antecipacao.custoMercadoria.credito)) {
		  		alert('Ok!');
		  	}
		 */
		
		//token = localStorage.getItem("userToken");
		//$http.defaults.header.common.Authorization = 'Bearer ' + token;
		$http({
			method : 'GET',
			url : '/margens' //'http://localhost:8080/margens' ... '/admin/margens'
		}).then(function(response) {
			$scope.margens = response.data;

		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
	};

	$scope.salvar = function() {
		
		if ($scope.frmMargem.$valid) {
		$http({
			method : 'POST',
			url : '/margens', //'http://localhost:8080/margens' ... '/admin/margens'
			data : $scope.margem
		}).then(function(response) {
			//$scope.margens.push(response.data);
			listar();
			$scope.cancelar();
			$scope.frmMargem.$setPristine(true);

		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
		} else {
			window.alert("Dados inválidos!");
		}
	}

	$scope.excluir = function(margem) {
		$http({
			method : 'DELETE',
			url : '/margens' + margem.id //'http://localhost:8080/margens/' + margem.id ... '/admin/margens'
		}).then(function(response) {
			pos = $scope.margens.indexOf(margem);
			$scope.margens.splice(pos, 1);

		}, function(response) {
			console.log(response.data);
			console.log(response.status);
		});
	}

	$scope.alterar = function(margem) {
		$scope.margem = angular.copy(margem);
	};

	$scope.cancelar = function() {
		$scope.margem = {};
	};

	listar();
	
	/* 
	 * appService.controller('ctrl', function ($scope){
	 * 
	 * $scope.margem = {};
	 * 
	 * $scope.list = [ {id:'1', atividade:'Autopeças no Estado de São Paulo',
	 * aliquota:'71.48'}, {id:'2', atividade:'Autopeças no Estado da Paraíba',
	 * aliquota:'71.78'} ];
	 * 
	 * $scope.selecionar = function(margem) { $scope.substituicao.agregacao =
	 * angular.copy(margem.aliquota); $scope.margem =
	 * angular.copy(margem.aliquota); }
	 * 
	 * });
	 */

});