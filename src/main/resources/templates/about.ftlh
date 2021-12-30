<!DOCTYPE html>
<html lang="en">
<head>
    <title>About</title>
    <#include 'fragments/template.ftlh'>
    <link rel="stylesheet" href="/css/about.css">
</head>
<body>
<#include 'fragments/header.ftlh'>
<#list memberList as member>
    <div class="card">
        <img src="${member.icon}" alt="Member"/>
        <div class="container">
            <h3><b>${member.name}</b></h3>
            <h4>${member.title}</h4>
            <p>${member.description}</p>
        </div>
    </div>
</#list>
<#include 'fragments/footer.ftlh'>
</body>
</html>