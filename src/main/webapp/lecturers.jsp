<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="UTF-8">
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Преподавательский состав</h2>
<table>
  <tr>
    <th>firstName</th>
    <th>lastName</th>
    <th>date_of_birth</th>
    <th>faculty_name</th>

  </tr>
  <c:forEach items="${lecturers}" var="lecturer">
    <tr>
      <td>${lecturer.firstName}</td>
      <td>${lecturer.lastName}</td>
      <td>${lecturer.date_of_birth}</td>
      <td>${lecturer.faculty_name}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>

