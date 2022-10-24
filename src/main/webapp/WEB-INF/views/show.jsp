<!DOCTYPE html>
<html>
	<head>
		<style><%@include file="/WEB-INF/views/style/style.css"%></style>
		<meta charset="ISO-8859-1">
		<title>${newNote.titolo}</title>
	</head>
	
	<body>
	
			<div class="container">
				<div class="show_content">
				
					<h1>${newNote.titolo}</h1>
					<p>${newNote.dataInserimento}</p>
					
					<p>${newNote.contenuto}</p>
					

				</div>
				
				<a href="/agnote/home" class="btnPrimary">Torna alla home</a>
			</div>
	</body>
</html>