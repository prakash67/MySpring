
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submitted Details</title>
</head>
<body>
	<h1 style="text-transform: capitalize">${headerMessgae}</h1>

	<p style="text-transform: uppercase;" align="center">Check Your
		Details</p>

	<p align="Left">ApplicantName: ${admission.applicantName}</p>
	<p align="Left">Gender: ${admission.gender}</p>
	<p align="Left">ApplicantAge: ${admission.applicantAge}</p>
	<p align="Left">ApplicantMobile : ${admission.applicantMobile}</p>
	<p align="Left">ApplicantDob: ${admission.applicantDob}</p>
	<p align="Left">ApplicantSkills: ${admission.applicantSkills}</p>
	<p align="Left">ApplicantAddress:
		${admission.applicantAddress.addressLine1}
		${admission.applicantAddress.addressLine2}
		${admission.applicantAddress.street}
		${admission.applicantAddress.state}
		${admission.applicantAddress.nationality}
		${admission.applicantAddress.pincode}</p>
</body>
</html>