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
        <title> Weather Forecasting </title>
    </head>
    <body>
        
        <h1> Tomorrow’s weather condition will be </h1>
        
         <table border="1">
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
                                    <c:forEach items="${data}" var="KaAll">
                                    <tr>
                                        <td>${KaAll.TMax}</td>
                                        <td>${KaAll.TMin}</td>
                                        <td>${KaAll.HAm}</td>
                                        <td>${KaAll.HPm}</td>
                                        <td>${KaAll.rainfall}</td>
                                        <td>${KaAll.sunshine}</td>
                                        <td>${KaAll.wind}</td>                                        
                                    </tr> 
                                            
                                    
                                    </c:forEach>
                                </tbody>                                
                            </table>
        
    </body>
</html>
