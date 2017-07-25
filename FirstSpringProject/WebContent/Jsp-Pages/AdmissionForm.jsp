

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addmission Form</title>
</head>
<body>
	<h1 style="text-transform: capitalize">${headerMessgae}</h1>
	<P style="text-transform: capitalize">Fill the addmission form</p>

	<c:set var="Errors">
		<form:errors path="admission.*" />
	</c:set>
	<c:if test="${not empty Errors}">

		<table>
			<tr>
				<td>Error:</td>
				<td>${Errors}</td>
			</tr>
		</table>

	</c:if>


	<form action="/FirstSpringProject/admissionSubmission" method="post">
		<table>
			<tr>
				<td><spring:message code="lable.applicantName" /></td>
				<td><input type="text" name="applicantName"></td>
			</tr>
			<tr>
				<td><spring:message code="lable.applicantAge" /></td>
				<td><input type="text" name="applicantAge"></td>
			</tr> 

			<tr>
				<td><spring:message code="lable.gender" /></td>
				<td><input type="radio" name="gender" value="male" ><spring:message code="lable.Male" /> 
					 <input type="radio" name="gender" value="female"><spring:message code="lable.Female" /> </td>
			</tr>
			<tr>
				<td><spring:message code="lable.applicantMobile" /></td>
				<td><input type="text" name="applicantMobile"></td>
			</tr>
			<tr>
				<td><spring:message code="lable.applicantDob" /></td>
				<td><input type="date" name="applicantDob"></td>
			</tr>
			<tr>
				<td><spring:message code="lable.applicantSkills" /></td>
				<td><select name="applicantSkills" multiple>
						<option value="Java Core"><spring:message code="lable.JavaCore" /></option>
						<option value="Spring Core"><spring:message code="lable.SpringCore" /></option>
						<option value="Spring MVC"><spring:message code="lable.SpringMVC" /></option>
				</select></td>
			</tr>
		</table>
		<table>
			<tr>
				<td><spring:message code="lable.applicantAddress" /></td>
				<td><spring:message code="lable.addressLine1" /></td>
				<td><input type="text" name="applicantAddress.addressLine1"></td>
			</tr>
			<tr>
				<td>
				<td><spring:message code="lable.addressline2" /></td>
				<td><input type="text" name="applicantAddress.addressLine2"></td>
			</tr>
			<tr>
				<td>
				<td><spring:message code="lable.street" /></td>
				<td><input type="text" name="applicantAddress.street"></td>
			</tr>
			<tr>
				<td>
				<td><spring:message code="lable.state" /></td>
				<td><input type="text" name="applicantAddress.state"></td>
			</tr>
			<tr>
				<td>
				<td><spring:message code="lable.nationality" /></td>
				<td><input type="text" name="applicantAddress.nationality"></td>
			</tr>
			<tr>
				<td>
				<td><spring:message code="lable.pincode" /></td>
				<td><input type="text" name="applicantAddress.pincode"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit Your Details"></td>
			</tr>
		</table>
	</form>
</body>
</html>