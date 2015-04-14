<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript">

$(document).ready(
		
	function(){
		$.getJSON('<spring:url value="activities.json"/>' , {
			ajax : 'true'
		} , function(data){
			var html = '<option value="">--Please Select One--</option>';
			var len = data.length;
			for(var i = 0;i< len ; i++){
				html += '<option value="'+data[i].desc + '">' + data[i].desc + '</option>';
			}
			
			html += '</option>';
			$('#activities').html(html);
			
		});
		
	
	
	});
</script>
</head>
<body>
	<h1>Add Minutes Exercised</h1>

	Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text"/> </td>
				<td><form:input path="minutes" /></td>
				<td><form:select path="activity" id="activities"></form:select> </td>
			</tr>
			<tr>
				<td colspan="3"> <input type="submit" value="Enter Exercise"> </td>
			</tr>
		</table>

	</form:form>
	<h1>Our Goal for the day is : ${goal.minutes}</h1>
</body>
</html>