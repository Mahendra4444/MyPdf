<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
  
</head>
<body>
    <p th:text="'Hello, ' + ${serverTime} + '!'" />
</body>
</html>