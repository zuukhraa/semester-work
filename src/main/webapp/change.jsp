<%@ page language="java" contentType="text/html;charset=cp1251"%>
<%@ page pageEncoding="cp1251"%>
<html>
<head>
    <title>��������� ������</title>
</head>
<body>
<%@include file="/WEB-INF/head.jsp" %>
<div class="position-absolute">
    <h1>������� ����� ������. �� ���������� ���� �������. ���� �� ������ ������ �����/������ ������� ������ ��������</h1>
    <br>
    <form method="post" action="/change">
        <p class="lead">
            <label>
                <input type="text" name="login" placeholder="����� �����">
            </label>
        </p>
        <p class="lead">
            <label>
                <input type="password" name="password" placeholder="����� ������">
            </label>
        </p>
        <br>
        <p class="lead">
            <button type="submit" class="btn btn-outline-dark btn-sm btn-block">���������</button>
        </p>
    </form>
</div>
</body>
</html>
