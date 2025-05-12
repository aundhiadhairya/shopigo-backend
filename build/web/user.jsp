<%-- 
    Document   : user
    Created on : Oct 20, 2023, 10:48:52 PM
    Author     : dhair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user Pg</title>

        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
            />
        <!--<link rel="stylesheet" href="C:\Users\dhair\OneDrive\Desktop\AJT_Project\web\css\forgot.css" />-->
        <style>
            @import url("https://fonts.googleapis.com/css?family=Montserrat:400,800");

            * {
                box-sizing: border-box;
            }

            body {
                background: #f6f5f7;
                display: flex;
                justify-content: center;
                align-items: center;
                flex-direction: column;
                font-family: "Montserrat", sans-serif;
                height: 100vh;
                margin: -20px 0 50px;
            }

            h1 {
                font-weight: bold;
                margin: 0;
            }

            h2 {
                text-align: center;
            }

            p {
                font-size: 14px;
                font-weight: 100;
                line-height: 20px;
                letter-spacing: 0.5px;
                margin: 20px 0 30px;
            }

            span {
                font-size: 12px;
            }

            a {
                color: #333;
                font-size: 14px;
                text-decoration: none;
                margin: 15px 0;
            }

            button,.btn {
                border-radius: 20px;
                border: 1px solid #e5345b;
                background-color: #e5345b;
                color: #ffffff;
                font-size: 12px;
                font-weight: bold;
                padding: 12px 45px;
                letter-spacing: 1px;
                text-transform: uppercase;
                transition: transform 80ms ease-in;
            }

            button:active,.btn:active {
                transform: scale(0.85);
            }

            form {
                background-color: #ffffff;
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
                padding: 0 50px;
                height: 100%;
                text-align: center;
            }

            input {
                background-color: #eee;
                border: none;
                padding: 12px 15px;
                margin: 8px 0;
                width: 100%;
            }

            .container {
                background-color: #fff;
                border-radius: 10px;
                box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
                position: relative;
                overflow: hidden;
                width: 700px;
                max-width: 100%;
                min-height: 700px;
            }

            .form-container {
                position: absolute;
                top: 45px;
                height: 80%;
                transition: all 0.6s ease-in-out;
            }

            .sign-in-container {
                top: 45px;
                left: 158px;
            }
        </style>
    </head>
    <body>

        <%
            String s = (String) session.getAttribute("mono");
            if (s == null) {
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.forward(request, response);
            }
            String mono = (String) session.getAttribute("mono");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select * from user where mono='" + mono + "'");
            if (res.next()) {

        %>


        <div class="container" id="container">
            <div class="form-container sign-in-container">
                <form action="index.html" method="post">
                    <h1 style="color: #e5345b">Welcome <%=res.getString(1)%></h1><br><br>
                    <h3>Mobile no. is :  <%= res.getString(2)%></h3>
                    <h3>Email is :  <%= res.getString(3)%></h3>
                    <h3>Password is :  <%= res.getString(4)%></h3>
                    <h3>Security key is :  <%= res.getString(5)%></h3><br><br><br>
                    <a href="update.html" class="btn">Update Info</a>
                    <a href="logout" class="btn">Logout</a>
                    <h4><a href="delete.html" class="btn">Delete User</a></h4>
                </form>
            </div>
        </div>




        <%}


        %>
    </body>
</html>