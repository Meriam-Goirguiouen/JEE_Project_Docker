<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste des Notes</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="mb-4 text-center">Liste des Notes</h2>

    <c:if test="${empty notes}">
        <div class="alert alert-warning">Aucune note trouvée.</div>
    </c:if>

    <c:if test="${not empty notes}">
        <div class="table-responsive">
            <table class="table table-bordered table-striped">
                <thead class="table-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">ID Étudiant</th>
                        <th scope="col">ID Matière</th>
                        <th scope="col">Valeur</th>
                        <th scope="col">Date d'attribution</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="note" items="${notes}">
                        <tr>
                            <td>${note.id}</td>
                            <td>${note.etudiantId}</td>
                            <td>${note.matiereId}</td>
                            <td>${note.valeur}</td>
                            <td>${note.dateAttribution}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </c:if>
</div>

<!-- Bootstrap JS (optional for modals etc.) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
