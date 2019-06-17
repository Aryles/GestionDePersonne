<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body height: 75%>
	<!--private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String mobile; -->
	
	<form action="search" method="post">
	<input class="form-control" type="text" name="id" value="${id}" placeholder="Search by id....." >
	</br>
	<button type="submit" class="btn btn-primary" value="Afficher" > search</button>
	</form>
		</br>
	<!-- boots -->
	<form action="ajouter" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="nom">nom</label>
      <input type="text" class="form-control" id="nom" name="nom"  placeholder="votre nom">
    </div>
    <div class="form-group col-md-6">
      <label for="prenom">Prénom</label>
      <input type="text" class="form-control" id="prenom" name="prenom" placeholder="votre prenom">
    </div>
  </div>
  <div class="form-group">
    <label for="adresse">Address</label>
    <input type="text" class="form-control" id="adresse" name="adresse"  placeholder="1234 Main St">
  </div>
  <div class="form-group">
    <label for="email"> Email</label>
    <input type="email" class="form-control" id="email" name="email" placeholder="jean@gmail.com">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="mobile">mobile</label>
      <input type="tel" class="form-control" name="mobile" id="mobile">
    </div>
   
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
	
	</br>
	
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NOM</th>
      <th scope="col">PRENOM</th>
      <th scope="col">ADRESSE</th>
      <th scope="col">EMAIL</th>
      <th scope="col">TELEPHONE</th>
    </tr>
  </thead>
  <tbody>
   	<c:forEach items="${listeDesPersonne}" var="p">
			<tr>
				<th scope= "row">${p.id }</td>
				<td>${p.nom }</td>
				<td>${p.prenom }</td>
				<td>${p.adresse }</td>
				<td>${p.email }</td>
				<td>${p.mobile }</td>
				<td><a href="delete?id=${p.id }">supprimer</a></td>
				<!--<td><a href="update?id=${p}">Edit</a></td> -->
				<td><a href="Forms?id=${p.id }">Edit</a></td>
 			</tr>
		</c:forEach>
  </tbody>
</table>
	
</body>
</html>