<%-- 
    Document   : lienAjax
    Created on : Apr 25, 2022, 8:53:25 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery.js"></script>
        <script>
            $(document).ready(function(){
                $.ajax({
                    url:'lienajax',
                    type: 'POST',
                    dataType:'html',
                    success: function (r) {
                        $('#aa').append(r);
                    }
                
            });
            
            $("#a").click(function(event) {
                event.preventDefault();
                alert("a");
                lien = ($(this).attr("href"));
                    $.ajax({
                    url: lien,
                    type: 'get',
                    dataType: "html",
                    success: function (resultat) {
                    $("#div").append(resultat);
            },
                    error: function () {
                    $("#div").html("Erreur de chargement...");
            }
          });
        });
      });
        </script>
    </head>
    <body>
        <a id="aa" ></a> 
        <div id="div"> </div>
        
    </body>
</html>
