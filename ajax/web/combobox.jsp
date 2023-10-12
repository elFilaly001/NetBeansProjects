<%-- 
    Document   : combobox
    Created on : Apr 21, 2022, 8:48:23 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="P.MyUtil"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="jquery.js"></script>
        <script>
            $(document).ready(function(){
                alert("ab");
                $.ajax({
                    url:'combobox',
                    type: 'POST',
                    dataType:'html',
                    data: '&op=c',
                    success: function (r) {
                        $('#cond').append(r);
                    }
                });
            });
            
            $('#cond').change(function (){
                alert("a")
                $.ajax({
                    url:'combobox',
                    type: 'post',
                    dataType:'html',
                    data:("id="+$('#cond').val()+"&op:'ch'"),
                    success:function (R){
                       $("#loc").html(R);
                    }
                });
            });
        </script>
    </head>
    <body>
        <label>no conducteur</label>
        <select id="cond">
           
        </select>
        <label>location</label>
        <select id="loc">
           
        </select>
    </body>
</html>
