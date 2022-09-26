<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Form</title>
</head>

<body>

	<div class="container">

		<h3>Student Details</h3>
		<hr>

		<!-- Add a search form -->

		<form action="/StudentManagement/student/search" class="form-inline">

			<!-- Add a button -->
			<a href="/StudentManagement/student/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Book </a> 

		</form>

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Name</th>
					<th>Department</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Student}" var="tempStudent">
					<tr>
						<td><c:out value="${tempStudent.name}" /></td>
						<td><c:out value="${tempStudent.department}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/LibraryManagement/books/showFormForUpdate?bookId=${tempStudent.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/StudentManagement/student/delete?bookId=${tempStudent.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
								Delete </a>

						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

</body>

</html>







