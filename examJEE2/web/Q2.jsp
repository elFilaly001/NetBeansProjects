<%-- 
    Document   : Q2
    Created on : Jun 8, 2022, 9:03:23 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="jquery.js"></script>
         <script>
              $(document).ready(function(){
                  $('#jardinier').change(function(){
                          $.ajax(
                                  url:'servletQ2',
                                  type:'get',
                                  datatype:'html',
                                  data:'id='+$('#jardinier').val(),
                                  succees=function(r){
                                          $('#information').html(r)
                                }
                        );
                });

            });
         </script>
    </head>
    <body>
        <%ResultSet rs=MyUtil.getcon().createStatment().executeQuery("select numjardinier from jardinier");%>
        <label>NUM J</label>
        <input type="text" name="numj">
        <label>nom</label>
        <input type="text" name="nom">
        <label>adress</label>
        <input type="text" name="adress">
        <label>ville</label>
        <input type="text" name="ville">
        <label>superficie</label>
        <input type="text" name="superf">
        <label>jardinier</label>
        <select id="jar">
            <%while(rs.next()){%>
            <option><%=rs.getString(1)%></option>
           <%}%>
        </select>
        <label id="info"></label>
    </body>
</html>
