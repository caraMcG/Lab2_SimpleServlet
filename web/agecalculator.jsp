<%-- 
    Document   : agecalculator
    Created on : Sep 17, 2018, 10:20:48 AM
    Author     : 731258
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calc</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="GET">
            Enter Your Age: <input type="text" name="ageNumber" placeholder="Enter your Age"><br/>
            <input type="submit" name="submit" value="Submit">
        </form>
        
        <br/>
        ${message}
        ${error}
        
        <br/>
        <br/>
        <a href="arithmeticcalculator.jsp"> Arithmetic Calculator </a>
        
    </body>
</html>
