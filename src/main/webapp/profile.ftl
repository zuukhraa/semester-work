<html lang="en">
<meta charset="UTF-8">
<#include "head.ftl">

<#macro title>Личная страница</#macro>
<#macro content>
<form action="/profile" method="post" novalidate enctype="multipart/form-data">
    <td><p class="lead">Добро пожаловать, ${user.firstName} ${user.lastName}</p></td>
    <td><p class="lead">Ваш факультет: ${user.faculty_name}</p></td>
</form>

    <br>
    <p class="lead">
        <a href="/change" class="btn btn-outline-dark btn-sm btn-block">Изменить логин/пароль</a>
    </p>
    <tr>
        <br>
        <td>
            <p class="lead"><a href="/logout">Выйти</a></p>
        </td>
    </tr>
    <br>
</#macro>
</html>