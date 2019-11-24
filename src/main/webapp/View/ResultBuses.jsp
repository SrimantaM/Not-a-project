<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	I'm HEre

	<table>
		<tr>
			<th>Bus No.</th>
			<th>Bus Type</th>
			<th>Price</th>
			<th>From</th>
			<th>To</th>
			<th>Date</th>
		</tr>
		
		<core:forEach var="busItem" items="${pageScope.busDetails}">
 		<tr>
			<td>${bus.busItem.busId}</td>
			<td>${bus.busItem.busType}</td>
			<td>${bus.busItem.ticketPrice}</td>
			<td>${source}</td>
			<td>${destination}</td>
			<td>${journeyDate}</td>
		</tr>
			</core:forEach>
	</table>
</body>
</html>