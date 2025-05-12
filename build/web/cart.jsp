<%-- 
    Document   : cart1
    Created on : Oct 23, 2023, 5:35:23 PM
    Author     : dhair
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>cart</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Kaisei+Tokumin:wght@400;500;700&family=Open+Sans:ital,wght@0,500;0,600;0,700;1,400;1,500&family=Poppins:wght@300;400;500&display=swap');

            body {
                margin: 0;
                padding: 0;
                background: linear-gradient(to bottom right, #e3f0ff, #fafcff);

                display: flex;
                justify-content: center;
                align-items: center;
            }

            .CartContainer {
                margin-top: 30px;
                margin-bottom: 30px;
                width: 70%;

                background-color: #ffffff;
                border-radius: 20px;
                box-shadow: 0px 10px 20px #1687d933;
            }

            .Header {
                margin: auto;
                width: 90%;
                height: 15%;
                display: flex;
                justify-content: space-between;
                align-items: center;
            }
            .Action {
                font-size: 14px;
                font-family: "Open Sans";
                font-weight: 600;
                color: #e44c4c;
                cursor: pointer;
                border-bottom: 1px solid #e44c4c;
            }
            .Heading {
                font-size: 34px;
                font-family: "Open Sans";
                font-weight: 700;
                color: #e5345b;

            }
            .titles{
                font-size: 25px;
                font-family: "Open Sans";
                font-weight: 600;
                color: #e5345b;

            }
            .total {
                position: relative;
                right: 60px;
                width: 100%;
                display: flex;
                justify-content: flex-end;

            }
            .Subtotal {
                font-size: 28px;
                font-family: "Open Sans";
                font-weight: 800;
                color: #202020;
            }
            .items {
                font-size: 25px;
                font-family: "Open Sans";
                font-weight: 600;
                color: #909090;
                line-height: 10px;
            }
            .total-amount {
                font-size: 36px;
                font-family: "Open Sans";
                font-weight: 900;
                color: #202020;
            }

            .button {
                margin-top: 10px;
                background-color: #e5345b;
                color: white !important;
                width: 100%;
                height: 50px;
                border: none;

                border-radius: 20px;
                cursor: pointer;
                font-size: 16px;
                font-family: "Open Sans";
                font-weight: 600;
            }
            #t1{
                width: 100%;
            }
            hr {
                width: 66%;
                float: right;
                margin-right: 5%;
            }
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <div class="CartContainer">
            <div class="Header">
                <h3 class="Heading">Shopping Cart</h3>
                <a href="remove"><h5 class="Action">Remove all</h5></a>
            </div>
            <table  cellpadding="10px" id="t1">

                <tr>
                    <td align="center"><span class="titles">Item number</span></td>
                    <td colspan="2" align="center"><span class="titles">Image</span></td>
                    <td align="center"><span class="titles">Price</span></td>
                </tr>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
                    Statement st = con.createStatement();
                    ResultSet res = st.executeQuery("select count(path) from item");
                    res.next();
                    int x = res.getInt(1);
                    int t = x * 999;

                    res = st.executeQuery("select * from item");
                    while (res.next()) {%>
                <tr>
                    <td align="center" class="Heading " style="color:black;"><%=res.getString(2)%></td>
                    <td colspan="2" align="center"><img
                            src="images/<%=res.getInt(1)%>.png"
                            style="height: 210px; width: 200px"
                            /></td>
                    <td align="center" class="Heading" style="color:black;">₹ 1299</td>
                </tr>
                <%
                    }
                %>
                <tr>
                    <td colspan="4" align="center">
                        <hr/><br>
                        <div class="total">
                            <div>
                                <div class=" Heading" >Total<pre style="display:inline">   </pre> <%="₹ " + t%></div><br>
                                <div class="items"><%=x%> items</div>
                            </div>
                            <div class="total-amount"></div>
                        </div><br></td>
                </tr>


                <tr>

                    <!--                    <td align="center">
                                            <button onclick="window.location.href = 'remove';" class="button" style="width:200px;">
                                                Remove All
                                            </button>
                                        </td>-->
                    <td colspan="4" align="center">
                        <div class="checkout">
                            <button onclick="window.location.href = 'index.jsp';" class="button" style="width:360px;">
                                Continue Shopping
                            </button>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
