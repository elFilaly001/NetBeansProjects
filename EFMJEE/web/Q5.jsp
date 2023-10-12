<%-- 
    Document   : Q5
    Created on : Jun 14, 2022, 10:50:49 AM
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
        
        
        
        <%
            
             
	Connection con =service.getcon();
	ResultSet r=con.createStatement().executeQuery("select * from examen");


            
            %>
        
        <table>

                
                <%
                    while(r.next()){
                %>
                <tr>
                    <td><%=r.getString(1)%></td>
                    <td><%=r.getString(2)%></td>
                    <td><%=r.getString(3)%></td>
                    <td><%=r.getString(4)%></td>
                    <td><a href="commenter.jsp?code_examen=<%=r.getString(1)%> " >commenter</a></td>
                  
                </tr>
                <%
                    }
                %>
        </table>
        <%}%>
        
        
    </body>
</html>
