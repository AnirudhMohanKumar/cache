<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>
<c:choose>
  <c:when test="${result eq 'invalid'}">
  	Invalid. Please <a href = "<c:url value = "reload"/>">Reload</a>
  </c:when>
  <c:otherwise>
	<p>Full Form: <c:out value="${result}"/><p>
  </c:otherwise>
</c:choose>
</body>
</html>

