package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>cart</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Kaisei+Tokumin:wght@400;500;700&family=Open+Sans:ital,wght@0,500;0,600;0,700;1,400;1,500&family=Poppins:wght@300;400;500&display=swap');\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background: linear-gradient(to bottom right, #e3f0ff, #fafcff);\n");
      out.write("\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .CartContainer {\n");
      out.write("                margin-top: 30px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                width: 70%;\n");
      out.write("\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 0px 10px 20px #1687d933;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .Header {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 90%;\n");
      out.write("                height: 15%;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            .Action {\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #e44c4c;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-bottom: 1px solid #e44c4c;\n");
      out.write("            }\n");
      out.write("            .Heading {\n");
      out.write("                font-size: 34px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 700;\n");
      out.write("                color: #e5345b;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .titles{\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #e5345b;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .total {\n");
      out.write("                position: relative;\n");
      out.write("                right: 60px;\n");
      out.write("                width: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .Subtotal {\n");
      out.write("                font-size: 28px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 800;\n");
      out.write("                color: #202020;\n");
      out.write("            }\n");
      out.write("            .items {\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #909090;\n");
      out.write("                line-height: 10px;\n");
      out.write("            }\n");
      out.write("            .total-amount {\n");
      out.write("                font-size: 36px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 900;\n");
      out.write("                color: #202020;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                background-color: #e5345b;\n");
      out.write("                color: white !important;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                border: none;\n");
      out.write("\n");
      out.write("                border-radius: 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("            #t1{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            hr {\n");
      out.write("                width: 66%;\n");
      out.write("                float: right;\n");
      out.write("                margin-right: 5%;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"CartContainer\">\n");
      out.write("            <div class=\"Header\">\n");
      out.write("                <h3 class=\"Heading\">Shopping Cart</h3>\n");
      out.write("                <a href=\"remove\"><h5 class=\"Action\">Remove all</h5></a>\n");
      out.write("            </div>\n");
      out.write("            <table  cellpadding=\"10px\" id=\"t1\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\"><span class=\"titles\">Item number</span></td>\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><span class=\"titles\">Image</span></td>\n");
      out.write("                    <td align=\"center\"><span class=\"titles\">Price</span></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
                    Statement st = con.createStatement();
                    ResultSet res = st.executeQuery("select count(path) from item");
                    res.next();
                    int x = res.getInt(1);
                    int t = x * 999;

                    res = st.executeQuery("select * from item");
                    while (res.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" class=\"Heading \" style=\"color:black;\">");
      out.print(res.getString(2));
      out.write("</td>\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><img\n");
      out.write("                            src=\"images/");
      out.print(res.getInt(1));
      out.write(".png\"\n");
      out.write("                            style=\"height: 210px; width: 200px\"\n");
      out.write("                            /></td>\n");
      out.write("                    <td align=\"center\" class=\"Heading\" style=\"color:black;\">₹ 1299</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"4\" align=\"center\">\n");
      out.write("                        <hr/><br>\n");
      out.write("                        <div class=\"total\">\n");
      out.write("                            <div>\n");
      out.write("                                <div class=\" Heading\" >Total<pre style=\"display:inline\">   </pre> ");
      out.print("₹ " + t);
      out.write("</div><br>\n");
      out.write("                                <div class=\"items\">");
      out.print(x);
      out.write(" items</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"total-amount\"></div>\n");
      out.write("                        </div><br></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <!--                    <td align=\"center\">\n");
      out.write("                                            <button onclick=\"window.location.href = 'remove';\" class=\"button\" style=\"width:200px;\">\n");
      out.write("                                                Remove All\n");
      out.write("                                            </button>\n");
      out.write("                                        </td>-->\n");
      out.write("                    <td colspan=\"4\" align=\"center\">\n");
      out.write("                        <div class=\"checkout\">\n");
      out.write("                            <button onclick=\"window.location.href = 'index.jsp';\" class=\"button\" style=\"width:360px;\">\n");
      out.write("                                Continue Shopping\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
