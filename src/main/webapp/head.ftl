<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <@title></@title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-expand-sm">
    <#if user?has_content>
        <td><p class="lead">Ваш логин: ${user.login}</p></td>
    </#if>
</nav>
<div class="mainer">
    <main role="main" class="container">
        <@content></@content>
    </main>
</div>
</body>
</html>