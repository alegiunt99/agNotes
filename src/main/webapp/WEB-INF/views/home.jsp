<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
	<style><%@include file="/WEB-INF/views/style/style.css"%></style>
		<title>agNotes - Home</title>
	</head>
	<body>
		
		<div class="container">
			
			<div class="titleCont">
			
				<h1>Benvenuto in agNotes</h1>
				
				<a href="/agnote/add_note">Aggiungi una nota</a>
			
			</div>
			
			<c:forEach items="${notes}" var="nota">
				
				<div class="casella">
				
						<div class="ante_nota">
							
							<h3>${nota.titolo}</h3>
							<p>${nota.dataInserimento}</p>
							
						</div>
						
						<div class="buttons">
							
							<a href="/agnote/show/${nota.id}">Mostra</a>
							
							<a href="/agnote/edit/${nota.id}">Modifica</a>
							
							<a href="/agnote/delete/${nota.id}">Elimina</a>
						
						</div>
				
				</div>
					
			</c:forEach>
				
			
		</div>
		
	</body>
</html>