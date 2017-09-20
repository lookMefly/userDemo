<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    			<table class="table table-bordered" ng-controller="foodController">
    				<caption>菜品展示</caption>
    				<thead>
    					<tr>
    						<th>编号</th>
    						<th>菜名</th>
    						<th>价格</th>
    						<th>操作</th>
    					</tr>
    				</thead>
    				<tbody>
    					<tr ng-repeat="food in foods">
    						<td>{{food.fid}}</td>
    						<td>{{food.sname}}</td>
    						<td>{{food.sprice}}</td>
    						<td>
    							<button class="btn btn-default"><span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;编辑</button>
    							<button class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span>&nbsp;&nbsp;删除</button>
    						</td>
    					</tr>
    				</tbody>
    			</table>
 	</body>
</html>