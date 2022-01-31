<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <#include 'fragments/template.ftlh'>
    <link rel="stylesheet" href="/css/home.css">
</head>
<body>
<#include 'fragments/header.ftlh'>

<div class="container flex flex_row--reverse center">
    <div class="is-one-third">
        <img src="/img/hero-img.jpg" alt="Hero" class="hero_img"/>
    </div>
    <div class="is-one-third">
        <h1>
            Code Sharing Platform
        </h1>
        <p>
            Quickly and easily upload code snippets that you can share with your colleagues. Using
            <a href="https://highlightjs.org/">highlight.js</a>,
            your snippets will be highlighted like if it were in an IDE. With an easy-to-use form, there's nothing
            stopping you from making CSP
            your day-to-day snippet uploading platform!
        </p>
        <div class="flex flex_row column_gap">
            <a class="button is-one-sixth primary" href="/code/new">Upload!</a>
            <a class="button is-one-sixth" href="/code/latest">Discover!</a>
        </div>
    </div>
</div>

<div class="container flex flex_row column_gap is-two-thirds">
    <i class="fas fa-cogs fa-3x primary--color"></i>
    <div class="text flex flex_column row_gap" style="width: 100%">
        <p>
            Fast, responsive and easy to use!
        </p>
        <hr style="width: 100%">
    </div>
</div>
<div class="container flex flex_row column_gap is-two-thirds">
    <i class="fas fa-cogs fa-3x primary--color"></i>
    <div class="text flex flex_column row_gap" style="width: 100%">
        <p>
            Powered by modern technologies like <a href="https://spring.io/">Spring</a> and <a href="https://highlightjs.org/">highlight.js</a>!
        </p>
        <hr style="width: 100%">
    </div>
</div>
<div class="container flex flex_row column_gap is-two-thirds">
    <i class="fas fa-cogs fa-3x primary--color"></i>
    <div class="text flex flex_column row_gap" style="width: 100%">
        <p>
            Privacy friendly. No account needed to use the service!
        </p>
        <hr style="width: 100%">
    </div>
</div>
<div class="container flex flex_row column_gap is-two-thirds">
    <i class="fas fa-cogs fa-3x primary--color"></i>
    <div class="text flex flex_column row_gap" style="width: 100%">
        <p>
            Public and private posts, by utilizing the timer and view count!
        </p>
        <hr style="width: 100%">
    </div>
</div>

<#include 'fragments/footer.ftlh'>
</body>
</html>