<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>
            <th>Name</th>
            <th>id</th>
        </tr>
            <tr>
                <td>${model.name}</td>
                <td>${model.id}</td>
            </tr>
    </table>


</body>
</html>
