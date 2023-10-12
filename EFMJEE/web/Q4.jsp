<%-- 
    Document   : Q4
    Created on : Jun 14, 2022, 10:32:57 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(request.getAttribute("resultat")!=null){
                ResultSet st=(ResultSet)request.getAttribute("resultat");
        %>
        <h1><%=st.getString(2)%> </h1>
    </body>
</html>
