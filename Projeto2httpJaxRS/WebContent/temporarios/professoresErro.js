var professoresModulo = angular.module('professoresModulo',[]);

professoresModulo.controller("professoresController", function ($scope) {
	$scope.professores = [
	    {codigo:1, nome:'Neri Neitzke',email:'videoaulaneri@gmail.com',fone:'54 3329 5400'},
		{codigo:2, nome:'Lisiane Neitzke',email:'lisiane@informaticon.com',fone:'54 3329 1111'},
		{codigo:3, nome:'Gustavo Neitzke',email:'gustavo@gmail.com',fone:'54 3329 6789'},
		{codigo:4, nome:'Giulia Neitzke',email:'Giulia@gmail.com',fone:'54 6666 6789'}
	];

	$scope.selecionaProfessor = function(professorSelecionado) {
		$scope.professor = professorSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.professor = "";
	}

	$scope.salvar = function() {
		$scope.professores.push($scope.professor);
		$scope.limparCampos();
	}

	$scope.excluir = function() {
		$scope.professores.splice($scope.professores.indexOf($scope.professor),1);
		$scope.limparCampos();
	}




});