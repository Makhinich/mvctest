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
        <c:forEach var="mode" items="${models}" >
            <tr>

                <%--когда имя передаем как параметр--%>
                <%--<td><a href="/model?modelName=${mode.name}">${mode.name}    </a> </td>--%>

                        <%--когда имя часть юрл --%>
                <td><a href="/model/${mode.name}">${mode.name}</a></td>
                <td>${mode.id}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
