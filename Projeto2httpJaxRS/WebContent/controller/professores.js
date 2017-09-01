var professorModulo = angular.module('professorModulo', []);

professorModulo.controller("professoresController", function($scope, $http) {
	
	var urlProfessor = 'http://localhost:8080/Projeto2httpJaxRS/rest/professores';
	

	$scope.listarProfessores = function() {
		$http.get(urlProfessor).success(function (professores)  {
			$scope.professores = professores;
		}).error (function (erro) {
			alert(erro);
		});
	}
	
	//selecionar professor para alterar/detalhar
	$scope.selecionaProfessor = function(professorSelecionado) {
		$scope.professor = professorSelecionado;
	}	
	
	//limpar campos
	$scope.limparCampos = function() {
		$scope.professor = "";
	}
	
	//salvar
	$scope.salvar = function() {
		/*se for vazio é novo registro */
		console.log('Conteudo do codigo: '+$scope.professor.codigo);
		if ($scope.professor.codigo == null) {
			console.log("Um insert novo");
			
			$http.post(urlProfessor, $scope.professor).success(function(professor) {
				//$scope.professores.push($scope.professor);
				$scope.limparCampos();
				$scope.listarProfessores();
			}).error(function (erro) {
				alert(erro);
			});
		}else{
			console.log("Uma atualização");
			
			$http.put(urlProfessor, $scope.professor).success(function(professor) {
				$scope.listarProfessores();
				$scope.limparCampos();
			}).error(function (erro) {
				alert(erro);
			});
		}
	}
	
	
	//excluir
	$scope.excluir = function() {
		if ($scope.professor.codigo != null ){
			console.log("Vamos excluir um cdr!");
			$http.delete(urlProfessor+'/'+$scope.professor.codigo).success(function(){
			
				$scope.listarProfessores();
				$scope.limparCampos();
			
			}).error(function (erro) {
				alert("Deu zebra.: "+erro);
				console.log(erro);
			
			});
		}
	};
	
	//executa
	$scope.listarProfessores();
	
});