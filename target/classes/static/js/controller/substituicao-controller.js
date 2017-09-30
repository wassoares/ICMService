appService.controller('substituicaoController', function($scope, $http) {
	
	$scope.listaEstados = ['AC', 'AL', 'AM', 'AP', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MG', 'MS',  
		'MT', 'PA', 'PB', 'PE', 'PI', 'PR', 'RJ', 'RN', 'RO', 'RR', 'RS', 'SC', 'SE', 'SP', 'TO'
	];
	
	$scope.substituicao = {};
	
	$scope.calcular = function() {
		if ($scope.frmSubstituicao.$valid) {
			$http({
				method : 'POST',
				url : '/substituicao',
				data : $scope.substituicao
			}).then(function(response) {
				$scope.substituicao = response.data;
			}, function(response) {
				console.log(response.data);
				console.log(response.status);
			});
		}
	}
	
	$scope.limpar = function() {
		$scope.substituicao = {};
	}	
		
});
