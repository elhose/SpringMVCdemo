<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>Customer Confirmation Form</title>
</head>

<body>

The Customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Postal Code: ${customer.postalCode}

<br><br>

Course Code: ${customer.courseCode}

<br><br>

Number of free passes: ${customer.freePasses}

</body>

</html>