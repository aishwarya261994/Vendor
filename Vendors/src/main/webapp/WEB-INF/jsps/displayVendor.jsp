<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>Id</td>
<td>Code</td>
<td>Name</td>
<td>Type</td>
<td>Phone</td>
<td>Email</td>
<td>Address</td>
</tr>
  <c:forEach items="${vendors}" var="vendor">
        <tr>
     <td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.type}</td>
<td>${vendor.phone}</td>
<td>${vendor.email}</td>
<td>${vendor.address}</td>
<td><a href="showVendorData?id=${vendor.id}">Edit</a></td>
<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
        </tr>
    </c:forEach>

</table>
<a href="showVendors">Add Record</a>
</body>
</html>