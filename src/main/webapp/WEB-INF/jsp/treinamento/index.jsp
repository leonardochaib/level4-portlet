<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<label>Hello Word!</label>

<c:choose>
    <c:when test="${treinamento.logged}">
        <strong>Seja bem vindo: ${treinamento.member.firstName} ${treinamento.member.lastName}</strong>
    </c:when>
    <c:otherwise>
        <strong>Deslogado</strong>
    </c:otherwise>
</c:choose>