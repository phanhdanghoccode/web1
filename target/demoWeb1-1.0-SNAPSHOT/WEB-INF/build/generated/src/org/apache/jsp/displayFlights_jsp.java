package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class displayFlights_jsp extends org.apache.jasper.runtime.HttpJspBase {

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
      out.write("        <table border=\"2\" style=\"width:500px\">\n");
      out.write("<tr>\n");
      out.write("  <th>Flight Number</th>\n");
      out.write("  <th>Destination</th> \n");
      out.write("  <th>Departure Date</th>\n");
      out.write("  <th>Departure Time</th>\n");
      out.write("  <th>No. of Seats</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td>1111</td>\n");
      out.write("  <td>Honolulu</td> \n");
      out.write("  <td>12-06-2014</td>\n");
      out.write("  <td>0900 GMT+5</td>\n");
      out.write("  <td>15</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        ");

            String disp = (String) request.getAttribute("info");
            out.println(disp);
            
      out.write("\n");
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
