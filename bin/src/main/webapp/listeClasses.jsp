<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Classes</title></head>
<body>
<h2>Classes</h2>
<table border="1">
    <tr><th>ID</th><th>Nom</th><th>Niveau</th></tr>
    <c:forEach var="c" items="${classes}">
        <tr>
            <td>${c.id}</td>
            <td>${c.nom}</td>
            <td>${c.niveau}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
