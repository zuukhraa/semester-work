<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<html lang="en" dir="ltr">
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>
<div class="center">
    <h1>�����������</h1>
    <form action="/register" method="post">
        <div class="txt_field">
            <input type="text" name="firstName" placeholder="���">
        </div>
        <div class="txt_field">
            <input type="text" name="lastName" placeholder="�������">
        </div>
        <div class="txt_field">
            <input type="text" name="login" placeholder="�����">
        </div>
        <div class="txt_field">
            <input type="password" name="password" placeholder="������">
        </div>
        <div class="txt_field">
            <input type="text" name="phone" placeholder="�������">
        </div>
        <div class="txt_field">
            <input type="text" name="faculty_name" placeholder="���������">
        </div>
        <input type="submit" value="������������������">
        <div class="signup_link">���� �������?
            <a href="/login">�����</a>
        </div>
    </form>
</div>
</body>
</html>

