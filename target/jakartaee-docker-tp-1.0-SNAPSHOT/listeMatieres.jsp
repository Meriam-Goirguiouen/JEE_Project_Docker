<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Matières</title></head>
<body>
<h2>Matières</h2>
<table border="1">
    <tr><th>ID</th><th>Nom</th><th>Description</th></tr>
    <c:forEach var="m" items="${matieres}">
        <tr>
            <td>${m.id}</td>
            <td>${m.nom}</td>
            <td>${m.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
