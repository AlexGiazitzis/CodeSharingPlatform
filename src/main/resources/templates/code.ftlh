<!DOCTYPE html>
<html lang="en">
<head>
    <title>${title}</title>
    <#include 'fragments/template.ftlh'>
    <link rel="stylesheet" href="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.3.1/build/styles/default.min.css">
    <script src="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.3.1/build/highlight.min.js"></script>
    <link rel="stylesheet" href="/css/code.css">
    <script>hljs.highlightAll();</script>
</head>
<body>
<#include 'fragments/header.ftlh'>
<#setting datetime_format="EEE. MMM. dd yyyy '@' HH:mm:ss a">
<#list codeList as code>
    <div id="code_area">
        <time id="load_date">${code.date.toString()?datetime.iso}</time>
        <#if code.viewLimited >
            <span id="views_restriction">${code.views}</span>
        </#if>
        <#if code.timeLimited >
            <span id="time_restriction">${code.time}</span>
        </#if>
        <pre id="code_snippet"><code>${code.code}</code></pre>
    </div>
</#list>
<#include 'fragments/footer.ftlh'>
</body>
</html>






