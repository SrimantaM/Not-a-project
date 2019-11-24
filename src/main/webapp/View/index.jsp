<html>
<body>
	<h2>Welcome To online BUS RESERVATION</h2>

	<form action="searchBuses">
		<table>
			<tr>
				<th>From</th>

				<td><input type="text" name="source" required /></td>
				<th>To</th>
				<td><input type="text" name="destination" required /></td>
			</tr>
			<tr>
				<th>Date of Journey</th>
				<td><input type="date" name="journeyDate" required /></td>
				
				<th>Return date</th>
				<td><input type="date" name="returnDate" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="search"/>
			</tr>
			
		</table>
	</form>
</body>
</html>
