<%@ page import="java.util.*,thidk.codelean.jdbc.*" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Tracker App</title>
		<link type="text/css" rel="stylesheet" href="css/style.css">
	</head>
	<%
		// get the students from the request object (sent by servlet)
		List<Student> theStudents =
						(List<Student>) request.getAttribute("STUDENT_LIST");
	%>
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>CodeLean Academy</h2>
			</div>
		</div>
		<div id="container">
			<div id="content">
				<table>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>image</th>
						<th>price</th>
					</tr>
					<% for (Student tempStudent : theStudents) { %>
						<tr>
							<td> <%= tempStudent.getFirstName() %> </td>
							<td> <%= tempStudent.getLastName() %> </td>
							<td> <%= tempStudent.getEmail() %> </td>
							<td> <%= tempStudent.getImage() %> </td>
							<td> <%= tempStudent.getPrice() %> </td>

						</tr>
					<% } %>
				</table>
			</div>
		</div>
	</body>
</html>








