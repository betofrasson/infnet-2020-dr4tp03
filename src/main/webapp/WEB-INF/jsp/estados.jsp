<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
	<title>APP DR4 TP03 - Estados</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>
<body>
	<c:import url="menu.jsp"/>

	<div class="container mt-2">
		<h2>Estados</h2>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Sigla</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Região</th>
		      <th scope="col">#</th>
		    </tr>
		  </thead>
		  <tbody>
		  
		    <c:forEach var="i" items="${estados}">
		    	<tr>
			      <th scope="row">${i.id}</th>
			      <td>${i.sigla}</td>
			      <td>${i.nome}</td>
			      <td>${i.regiao.nome}</td>
			      <td><a href="/estados/${i.id}/municipios">Municípios</a></td>
			    </tr>	  
		    </c:forEach>
		    
		  </tbody>
		</table>
	</div>

</body>
</html>