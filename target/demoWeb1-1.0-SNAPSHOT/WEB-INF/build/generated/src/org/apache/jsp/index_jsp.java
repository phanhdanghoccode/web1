package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"ControllerServlet\" method=\"post\">  \n");
      out.write("            \n");
      out.write("Customer Name:<input type=\"text\" name=\"name\"><br>  \n");
      out.write("Customer Passport Number:<input type=\"text\" name=\"passport\"><br>\n");
      out.write("Customer ID:<input type=\"text\" name=\"customerid\"><br>\n");
      out.write("Customer Phone:<input type=\"text\" name=\"phone\"><br>\n");
      out.write("Customer Address:<input type=\"text\" name=\"address\"><br>\n");
      out.write("\n");
      out.write("Flight Number:<input type=\"text\" name=\"flightnumber\"><br>\n");
      out.write("Departure Date (DD/MM/YYYY):<input type=\"text\" name=\"depdate\"><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"login\">  \n");
      out.write("</form>  \n");
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
