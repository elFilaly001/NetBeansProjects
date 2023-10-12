<%-- 
    Document   : connect
    Created on : Apr 14, 2022, 11:24:30 AM
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
            
            $('#op').click(function(){
               
               $.ajax({
               url:'connect',
               datatype:'html',
               type:'post', 
               data:'login='+$("#log").val()+'&pwd='+$("#pwd").val(),
               success: function(r){if(r !==0){ 
                       window.window.location.replace("menu.jsp");
                   }
               },
               error:function(){$('#message').html("Erreur de chargement");}
           });
           
        });    
        });      
    </script>
    </head>
    <body>
        <label>login</label><br>
        <input type="text" id="log" ><br>
        <label>pasword</label><br>
        <input type="text" id="pwd" ><br>
        <input type="submit" id="op" value="connect">
        <div id="message"></div>
    </body>
    
</html>
