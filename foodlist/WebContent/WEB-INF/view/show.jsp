<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/jquery.min.js" ></script>
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <script type="text/javascript" src="js/angular.min.js" ></script>
        <script type="text/javascript" src="js/angular-route.min.js" ></script>
        <link rel="stylesheet" href="css/bootstrap.min.css" />
    </head>
    <body ng-app="foodApp">
    	<div class="container">
    		<div class="row">
    			<form>
	    			关键字：<input type="text" name="name" ng-model="name" />
	    			<button class="btn btn-default btn-sm" onclick="query()"><span class="glyphicon glyphicon-search"></span>查询</button>
    			</form>
    			<div id="listDiv"></div>
    		</div>
    	</div>
    	<script>
    		$(function(){
    			query();
    		});
    		function query (){
    			$.post(
    				"togetlist.do",
    				$("form").serialize(),
    				function(msg){
    					$("#listDiv").html(msg)
    				},
    				"html"
    			);
    		}
    		var app = angular.module("foodApp",["ngRoute"]);
    		app.controller("foodController",["$scope","$location","$http",function($scope,$location,$http){
    			$http({
    				method:"get",
    				url:"togetlist.do"
    			}).then(function(response){
    				alert(response.data);
    				$scope.foods = response.data;
    			});
    		}]);
    	</script>
 	</body>
</html>