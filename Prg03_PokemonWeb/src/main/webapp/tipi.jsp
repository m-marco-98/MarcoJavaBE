<!DOCTYPE html>
<%@page import="controller.PokemonCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Tipi pokemon</h1>
	
	<div>
		<a href="index.html">Home page</a>
	</div>
	
	<ul>
	
		<% PokemonCtrl controller = new PokemonCtrl(); %>
	
		<% for (String tipiPokemon : controller.getTipiPokemon()) { %>
			<li>
				<a target="blank" href = "https://www.google.com/search?q=Pokemon+<%= tipiPokemon %>">
					<%= tipiPokemon %>
				</a>	
			</li>	
		<% } %>
		
	</ul>

</body>
</html>