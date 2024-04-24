<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passenger Registration Form</title>
</head>
<body>
    <h2>Passenger Registration</h2>
    <form action="/passenger/register" method="post">
        Passenger Name: <input type="text" name="passenger_name"><br>
        Date of Birth: <input type="date" name="passenger_dob"><br>
        Phone: <input type="text" name="passenger_phone"><br>
        Email: <input type="email" name="passenger_email"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>