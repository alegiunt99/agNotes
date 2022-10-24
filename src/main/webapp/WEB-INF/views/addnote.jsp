<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<style><%@include file="/WEB-INF/views/style/style.css"%></style>	
	<meta charset="ISO-8859-1">
	<title>Add note</title>
</head>
<body>
	
	<div class="container">
		
		<h1>Aggiungi una nota</h1>
		<form:form action="save" modelAttribute="newNote" class="form-group">
			
			<form:hidden path="id" />
				
			<form:label path="titolo">Titolo</form:label><br>
			<form:input path="titolo"/><br>
				
			<form:label path="contenuto">Contenuto</form:label><br>
			<form:input path="contenuto"/><br>
			
				
			<input type="submit" value="Salva">
		
			
		</form:form>
		
		<a href="/agnote/home" class="btnPrimary">Torna alla home</a>
	</div>
	
	
</body>
</html>