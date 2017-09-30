appService.directive('msgAlerta', function(){
	return {
		require: '^?ngShow',
		restrict: 'E',
		scope: {
			destaque: '@',
			texto: '@',
			opcao: '='
		},
		templateUrl: "/view/alerta.html"		
	};
});

/*appService.directive('msgInfo', function(){
	return {
		//require: '^?ngClass',
		restrict: 'A',
		priority: 2,
		template: 'class="alert alert-info"'
		
		link: function(scope, element, attr) {
			element.addClass('msg-estilo');
			console.log(scope);
			console.log(element);
			console.log(attr);
		}
	};
});*/
