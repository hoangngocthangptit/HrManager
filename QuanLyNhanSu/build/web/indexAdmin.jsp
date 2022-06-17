<%-- 
    Document   : indexAdmin
    Created on : Nov 11, 2018, 4:28:33 PM
    Author     : HaKiet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Quản Lý  Nhân Viên</title>
    </head>
    <body style="background: url(images/bann.jpg) fixed;font-size:12px !important;">
        <%
            if(session.getAttribute("user") == null )
            {
                response.sendRedirect("404.jsp");
            }
        %>
        <section id="container" class="">
            <jsp:include page="header.jsp"></jsp:include>
            <jsp:include page="menu.jsp"></jsp:include>
            <jsp:include page="content.jsp"></jsp:include>
        </section>
    </body>
</html>
