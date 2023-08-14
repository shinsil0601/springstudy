<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%-- ${pageContext.request.contextPath} => 해당프로젝트 (BBS) --%>
	<jsp:forward page="/MyController" > 
		<jsp:param value="list" name="cmd" />
	</jsp:forward>
		<%-- <jsp:param value="list" name="cPage" /> 페이징 기법에 적용--%>
</body>
</html>