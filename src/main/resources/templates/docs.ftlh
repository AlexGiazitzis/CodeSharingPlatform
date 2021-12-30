<!DOCTYPE html>
<html lang="en">
<head>
    <title>Docs</title>
    <link rel="stylesheet" href="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.3.1/build/styles/default.min.css">
    <script src="//cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.3.1/build/highlight.min.js"></script>
    <#include 'fragments/template.ftlh'>
    <link rel="stylesheet" href="/css/docs.css">
    <script>hljs.highlightAll();</script>
</head>
<body>
<#include 'fragments/header.ftlh'>
<div class="container">
    <#list endpointList as endpoint>
        <section class="container--single">
            <code class="endpoint"><b>${endpoint.method}</b> ${endpoint.path} :</code>
            <p class="description">
                &emsp;&emsp;${endpoint.description} <br/>
                &emsp;&emsp;Example:
            </p>
            <pre class="example-container">
        Request:
        <code class="language-shell example">
            ${endpoint.exampleRequest}
        </code>
        Response:
        <code class="language-json example">
            ${endpoint.exampleResponse}
        </code>
    </pre>
        </section>
    </#list>
</div>
<#include 'fragments/footer.ftlh'>
</body>
</html>