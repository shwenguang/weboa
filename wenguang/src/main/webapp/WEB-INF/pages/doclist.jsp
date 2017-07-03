<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>

</head>
<body>
<c:forEach var="item" items="${doclist }" varStatus="vs">  
   ${vs.index + 1 }. <a href="/wg/docid/1">${item.name }</a><br>
</c:forEach>  
</body>
</html>

