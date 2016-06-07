<%-- 
    Document   : DisplayData
    Created on : May 30, 2016, 11:58:58 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table border="2">
                                <thead>
                                    <tr>
                                        <th>Tmax</th>
                                        <th>Tmin</th>
                                        <th>H_AM</th>
                                        <th>H_PM</th>
                                        <th>Rainfall</th>
                                        <th>Sunshine</th>
                                        <th>Wind</th>                                        
                                    </tr>
                                </thead>
                                
                                 
                                <tbody>
                                    <c:forEach items="${data}" var="Weather">
                                    <tr>
                                        <td>${Weather.t_max}</td>
                                        <td>${Weather.t_min}</td>
                                        <td>${Weather.h_am}</td>
                                        <td>${Weather.h_pm}</td>
                                        <td>${Weather.rainfall}</td>
                                        <td>${Weather.sunshine}</td>
                                        <td>${Weather.wind}</td>                                        
                                    </tr>                                     
                                    </c:forEach>
                                </tbody>                                
                            </table>
        
    </body>
</html>
