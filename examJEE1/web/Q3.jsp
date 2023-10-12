<%-- 
    Document   : Q3
    Created on : Apr 28, 2022, 11:14:44 AM
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
                Connection c=MyUtil.seConnecter();
                ResultSet r=c.createStatement().executeQuery("select code_poste,count(*) from employe group by code_poste");
               
                %> 
                <table border="2px">
                <tr>
                    <td>poste</td>
                    <td>nombre employe</td>
                </tr>
     
            <% while(r.next()){%>
            
                <tr>
                    <td><%=r.getString(1)%></td>
                    <td><%=r.getString(2)%></td>
                </tr>
           
        <%}%> 
                </table>
    </body>
</html>
