appService.controller('antecipacaoController', function($scope, $http) {
	
	$scope.listaEstados = ['AC', 'AL', 'AM', 'AP', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MG', 'MS',  
		'MT', 'PA', 'PB', 'PE', 'PI', 'PR', 'RJ', 'RN', 'RO', 'RR', 'RS', 'SC', 'SE', 'SP', 'TO'
	];
	
	$scope.antecipacao = {};
	
	
	$scope.calcular = function() {
		if ($scope.frmAntecipacao.$valid) {
			$http({
				method : 'POST',
				url : '/antecipacao',
				data : $scope.antecipacao
			}).then(function(response) {
				$scope.antecipacao = response.data;
			}, function(response) {
				console.log(response.data);
				console.log(response.status);
			});
		}
	}
	
	$scope.limpar = function() {
		$scope.antecipacao = {};
	}
	
});

