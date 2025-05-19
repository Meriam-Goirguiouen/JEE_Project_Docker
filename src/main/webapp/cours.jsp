<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Cours</title></head>
<body>
<h2>Cours</h2>
<table border="1">
    <tr><th>ID</th><th>Nom</th><th>Id Matiere</th><th>Id Professeur</th></tr>
    <c:forEach var="e" items="${cours}">
        <tr>
            <td>${e.id}</td>
            <td>${e.nom}</td>
            <td>${e.matiere_id}</td>
            <td>${e.professeur_id}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
