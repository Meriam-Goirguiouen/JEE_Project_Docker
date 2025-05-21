<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title> Liste des Salles</title>
    </head>
    <body>
        <h2>
            <i style="text-align: center;">Liste des salles</i>
        </h2>
        <table border="1">
            <tr>
                <th>Id Salle</th>
                <th>Nom Salle</th>
                <th>Capacite</th>
                <th>Type</th>
                <th>Batiment</th>
            </tr>
            <c:forEach var="salle" items="${salles}">
            <tr>
                <td>${salle.idSalle}</td>
                <td>${salle.nomSalle}</td>
                <td>${salle.capacite}</td>
                <td>${salle.type}</td>
                <td>${salle.batiment}</td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>

