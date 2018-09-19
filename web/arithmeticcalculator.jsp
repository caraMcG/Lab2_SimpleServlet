<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 17, 2018, 12:24:53 PM
    Author     : 731258
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calc</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="GET">
            First: <input type="text" name="first" value=${first}><br/>
            Second: <input type="text" name="second" value=${second}><br/>
            <input type="submit" name="plus" value="+">
            <input type="submit" name="minus" value="-">
            <input type="submit" name="times" value="*">
            <input type="submit" name="modu" value="%"><br/>
        </form>
        <br/>
        ${message}
        <br/>
        ${error}
        <br/>
        <br/>
        <a href="age"> Age Calculator </a>

        
    </body>
</html>
