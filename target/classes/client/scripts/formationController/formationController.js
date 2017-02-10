<script>
// var helloApp = angular.module("Formation", []);
// helloApp.controller("formationController", function($scope) {
// $scope.companies = [
// { 'nomFormation':'',
// 'diplome': ,
// 'doubleDiplome': 'Bangalore'?
// 'debutAccreditation':'',
// 'finAccredidation':'',
// 'Numero Annee':'',
// 'codeFormation':''},
//                    	
// ];
// $scope.addRow = function(){
// $scope.companies.push({ 'name':$scope.name,
// 'employees': $scope.employees,
// 'headoffice':$scope.headoffice });
// $scope.name='';
// $scope.employees='';
// $scope.headoffice='';
// };
// )};


'use strict';

angular.module('app')
	.service('ServiceFormation',[ '$http' , function ($http) {
	this.getAllFormation = function(callback){
		var url = "/formation";
		$http.get(url).then(function(response){
			callback(response.data);
		});
	};
}]);

angular.module('app')
  .controller('formationController', ['$scope','ServiceFormation',function ($scope, ServiceFormation) {
	$scope.formations = [];
	ServiceFormation.getAllFormation(function (data) {
		$scope.formations = data;
		console.log($scope.formations);
	});
}]);
</script>