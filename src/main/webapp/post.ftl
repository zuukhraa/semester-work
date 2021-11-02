<#ftl encoding="UTF-8">
<html lang="en">
<meta charset="UTF-8">
<#include "head.ftl">
<#macro title>
    <title>Добавление поста</title>
</#macro>
<#macro content>
    <br>
    <h1>Пост</h1>
    <br>
    <form action="/post" method="post">
        <p class="lead">
            Введите название:<br>
            <input name="title" type="text" placeholder="Название" style="width: 710px"><br>
        </p>
        <p class="lead">
            Введите содержание:<br>
            <label>
                <input name="content" placeholder="..." type="text"/>
            </label><br>
        </p>
        <p class="lead">
            Введите дату:<br>
            <label>
                <input name="creation_data" placeholder="дд.мм.гг" type="text"/>
            </label><br>
        </p>
        <br>
        <p class="lead"><input type="submit" value="Сохранить"></p>
        <br>
    </form>
</#macro>