<!DOCTYPE html>
<%@page import="controller.PokemonCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista pokemon</h1>
	
	<div>
		<a href="index.html">Home page</a>
	</div>
	
	<ul>
	
		<% PokemonCtrl controller = new PokemonCtrl(); %>
	
		<% for (String nomePokemon : controller.getNomiPokemon()) { %>
			<li>
				<a target="blank" href = "https://www.google.com/search?q=<%= nomePokemon %>">
					<%= nomePokemon %>
				</a>	
			</li>	
		<% } %>
		
	</ul>

</body>
</html>