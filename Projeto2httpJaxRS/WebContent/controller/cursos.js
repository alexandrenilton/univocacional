var cursoModulo = angular.module('cursoModulo', []);

cursoModulo.controller("cursosController", function($scope, $http) {
	
	var urlProfessor = 'http://localhost:8080/Projeto2httpJaxRS/rest/professores';
	var urlCurso = 'http://localhost:8080/Projeto2httpJaxRS/rest/cursos';
	
	
	$scope.listarProfessores = function() {
		$http.get(urlProfessor).success(function(professores) {
			$scope.professores = professores;
			console.log("professores.: "+professores);
		}).error(function (erro) {
			alert('Erro ao buscar professores.: '+erro);
		})
	}

	$scope.listarCursos = function() {
		$http.get(urlCurso).success(function (cursos)  {
			$scope.cursos = cursos;
		}).error (function (erro) {
			alert(erro);
		});
	}
	
	//selecionar curso para alterar/detalhar
	$scope.selecionaCurso = function(cursoSelecionado) {
		$scope.curso = cursoSelecionado;
	}	
	
	//limpar campos
	$scope.limparCampos = function() {
		$scope.curso = "";
	}
	
	//salvar
	$scope.salvar = function() {
		/*se for vazio é novo registro */
		console.log('Conteudo do codigo: '+$scope.curso.codigo);
		if ($scope.curso.codigo == null) {
			console.log("Um insert novo");
			
			$http.post(urlCurso, $scope.curso).success(function(curso) {
				$scope.cursos.push($scope.curso);
				$scope.limparCampos();
			}).error(function (erro) {
				alert(erro);
			});
		}else{
			console.log("Uma atualização");
			
			$http.put(urlCurso, $scope.curso).success(function(curso) {
				$scope.listarCursos();
				$scope.limparCampos();
			}).error(function (erro) {
				alert(erro);
			});
		}
	}
	
	
	//excluir
	$scope.excluir = function() {
		if ($scope.curso.codigo != null ){
			console.log("Vamos excluir um cdr!");
			$http.delete(urlCurso+'/'+$scope.curso.codigo).success(function(){
			
				$scope.listarCursos();
				$scope.limparCampos();
			
			}).error(function (erro) {
				console.log(erro);
			});
		}
	};
	
	//executa
	$scope.listarProfessores();
	$scope.listarCursos();
	
});