<!DOCTYPE html>
<html lang="en">
<head>
    <title>Create</title>
    <#include 'fragments/template.ftlh'>
    <link rel="stylesheet" href="/css/create.css">
    <script type="text/javascript" src="/js/postCode.js"></script>
</head>
<body>
<#include 'fragments/header.ftlh'>
<div id="form">
    <form id="code_area">
        <label for="code_snippet">Enter your snippet below:</label>
        <textarea id="code_snippet" rows="15" cols="100"></textarea>
        <div id="restrictions">
            <div id="time">
                <label for="time_restriction">Lifespan duration:</label>
                <input id="time_restriction" type="text" value="0"/>
            </div>
            <div id="views">
                <label for="views_restriction">Views limit:</label>
                <input id="views_restriction" type="text" value="0"/>
            </div>
        </div>
        <button id="send_snippet" type="button" onclick="send()">Submit</button>
    </form>
</div>
<#include 'fragments/footer.ftlh'>
</body>
</html>