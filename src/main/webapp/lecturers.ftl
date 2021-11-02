<#ftl encoding="UTF-8">
<html lang="en">
<meta charset="UTF-8">
<#include "head.ftl">
<html>
<head>
    <title>Title</title>
</head>

<#macro content>
    <br>
    <h1>Ваши статьи</h1>
    <br>
    <form action="/lecturers" method="post">
        <p class="lead" id="1" style="float: left; margin-right: 50px;">
            Поиск по фамилии:<br>
            <input name="lastName" type="text"/><br>
        </p>
        <br>
        <br>
        <p class="lead" style="margin-right: 1000px;">
            <input type="submit" value="Найти">
        </p>
    </form>
    <br>
    <#if lecturers??>
        <#if lecturers?has_content>
            <#list lecturers as lecturer>
                <a href="/?id=${lecturer.id}">
                    <div class="alert alert-dark" role="alert">
                        <h2>${lecturer.firstName}</h2>
                        <br>
                        <div>${lecturer.lastName}</div>
                        <br>
                        <div>${lecturer.date_of_birth}</div>
                        <br>
                        <div>${lecturer.faculty_name}</div>
                        <br>
                        <#--                        <div><small class="text-muted">Статья номер ${article.id}</small></div>-->
                        <br>
                    </div>
                </a>
            </#list>
        <#else>
            <p class="lead">Нет списка!</p>
        </#if>
    </#if>
</#macro>

<#--<body>-->
<#--<h2>Преподавательский состав</h2>-->
<#--<table>-->
<#--    <tr>-->
<#--        <th>Имя</th>-->
<#--        <th>Фамилия</th>-->
<#--        <th>Дата рождения</th>-->
<#--        <th>Факультеты</th>-->

<#--    </tr>-->
<#--    <c:forEach items="${lecturers}" var="lecturer">-->
<#--        <tr>-->
<#--            <td>${lecturer.firstName}</td>-->
<#--            <td>${lecturer.lastName}</td>-->
<#--            <td>${lecturer.date_of_birth}</td>-->
<#--            <td>${lecturer.faculty_name}</td>-->
<#--        </tr>-->
<#--    </c:forEach>-->
<#--</table>-->
<#--</body>-->
<#--</html>-->

