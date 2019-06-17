<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire de modification</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body>


	<form action="update?id=${idLast}" method="post">
		<h4>Modification de personne Id=${idLast}</h4>

		</br> </br> </br>


		</div>
		<div class="form-group col-md-6">
			<label for="nom">nom</label> <input type="text" class="form-control"
				id="nom" name="nom" placeholder="votre nom">
		</div>
		<div class="form-group col-md-6">
			<label for="prenom">Prénom</label> <input type="text"
				class="form-control" id="prenom" name="prenom"
				placeholder="votre prenom">
		</div>
		</div>
		<div class="form-group">
			<label for="adresse">Address</label> <input type="text"
				class="form-control" id="adresse" name="adresse"
				placeholder="1234 Main St">
		</div>
		<div class="form-group">
			<label for="email"> Email</label> <input type="email"
				class="form-control" id="email" name="email"
				placeholder="jean@gmail.com">
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="mobile">mobile</label> <input type="tel"
					class="form-control" name="mobile" id="mobile">
			</div>

		</div>
		<button type="submit" class="btn btn-primary">Modifier</button>
	</form>
</body>
</html>