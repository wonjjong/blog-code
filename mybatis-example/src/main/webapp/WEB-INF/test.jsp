<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="static/js/jquery-3.6.0.min.js" rel="stylesheet">
<link href="static/js/bootstrap.min.js" rel="stylesheet">
<link href="static/css/bootstrap.min.css" rel="stylesheet">

<html>
    <head>
        <title> test </title>
    </head>
    <body>
        <h2> Hello World </h2>

    <form name="testForm" id="testForm" method="post" >
        <input type="hidden" name="username" id="username" value ="jongmin" />
        <input type="hidden" name="certNm" id="certNm" value = "wonjjong"/>

        <input type="text" id="cc" name="cc">
        <input type="test" id="jumin" name="jumin">
        <div class="row">
            <button class="btn btn-danger"> 제출</button>
        </div>
    </form>

    </body>

</html>