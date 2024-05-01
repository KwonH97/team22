<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<table>
		<tr>
			<th>제목</th>
			<td>${board.getTitle()}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.getContent()}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${board.getWriter()}</td>
		</tr>
	</table>
	<a href="delete?bno=${board.getBno()}">삭제</a>
	<a href="list">목록으로</a>

</body>
</html>