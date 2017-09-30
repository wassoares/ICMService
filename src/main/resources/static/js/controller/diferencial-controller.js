appService.controller('diferencialController', function($scope, $http) {
	
	$scope.listaEstados = ['AC', 'AL', 'AM', 'AP', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MG', 'MS',  
		'MT', 'PA', 'PB', 'PE', 'PI', 'PR', 'RJ', 'RN', 'RO', 'RR', 'RS', 'SC', 'SE', 'SP', 'TO'
	];
	
	$scope.rotinas = ['PADRAO', 'ESPECIFICO'];
	
	$scope.diferencial = {};
	
	
	$scope.calcular = function() {
		if ($scope.frmDiferencial.$valid) {
			$http({
				method : 'POST',
				url : '/diferencial',
				data : $scope.diferencial
			}).then(function(response) {
				$scope.diferencial = response.data;
			}, function(response) {
				console.log(response.data);
				console.log(response.status);
			});
		}
	}
	
	$scope.limpar = function() {
		$scope.diferencial = {};
	}
	
});