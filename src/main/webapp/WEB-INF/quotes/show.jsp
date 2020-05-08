<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    <link rel="stylesheet" href="/css/main.css">

    <link rel="stylesheet" href="/css/sticky-footer.css">
</head>
<body>
<nav class="nav">
    <ul>
        <li><a href="/">Home</a></li>
        <li><a href="/quotes">List All Quotes</a></li>
        <li><a href="/quotes/random">Get a random quote</a></li>
    </ul>

</nav>


<div class="container">
    <h1>Quote: ${quote.quote}</h1>
    <p>Author: ${quote.author}</p>

    <a href="/quotes/random" class="btn btn-primary">Get another random quote!</a>

</div>

</body>
</html>