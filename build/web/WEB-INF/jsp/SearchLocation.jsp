<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Demo</title>
    </head>

    <body>
        <form method="POST" action="<spring:url value="/SubmitLocation/{cityName}"/>">
	Enter City :
		<input id="cityName" name="cityName" size="30" type="text" />
		<input id="getWeatherReport" name="getWeatherReport" type="submit" value="Get Weather" />
	</form>
	<div id="weatherReport" class="outputTextArea"></div>
	
	<script type="text/javascript" src="jquery-1.4.4.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#getWeatherReport").click(function(){
			$cityName = document.getElementById("cityName").value;
			$.post("Weather", {cityName:$cityName}, function(data) {
				alert(data);
				$("#weatherReport").html(data);
			});
		});
	});
	</script>
    </body>
</html>
