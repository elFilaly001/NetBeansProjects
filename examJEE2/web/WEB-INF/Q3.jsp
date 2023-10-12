<%-- 
    Document   : Q3
    Created on : Jun 8, 2022, 9:52:26 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
             $(document).ready(function(){
                  $('#jardinier').change(function(){
                          $.ajax(
                                  url:'Q3',
                                  type:'get',
                                  datatype:'html',
                                  data:'id='+$('#jardinier').val(),
                                  succees=function(r){
                                          $('#listejardin').html(r)
                                }
                        )
                })
                
                $(document).on('click','.numjardin',function(){
                                 
        
                    $.ajax({
                        url:'Q3',
                        dataType: 'html',
                        type: 'post',
                        data:'id='+$('.numjardin').attr('id'),
                        success: function (r) {
                                $("#contenujardin").html(r);  
                        }
                    });
                });

            })
            
        </script>
    </head>
    <body>
        <%
            Connection con =MyUtil.seConnecter();
            ResultSet rs=con.createStatement().executeQuery("select NumJardinier from jardinier");
        %>
        <select id="jardinier" name="jardinier">
            <%
                while(r.next()){
            %>
                    <option value="<%=rs.getString(1)%>"><%=rs.getString(1)%></option>

            <%
                }
            %>
        </select>
        
        <table id="listejardin"></table>
        <table id="contenujardin"></table>
    </body>
</html>
