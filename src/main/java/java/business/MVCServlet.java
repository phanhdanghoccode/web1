
package java.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "MVCServlet", urlPatterns = {"/MVCServlet"})
public class MVCServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PersistentClass obj=new PersistentClass();
       //obj.saveRoom(10, 10000, "suite");
       
        Hotel hotel=null;
        hotel=hotel.getHotelInstance();;//=new Hotel();
        //hotel=
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String pageName=request.getParameter("namePage");
        if (pageName.equalsIgnoreCase("index.jsp"))
            {
       String flightBookingNo= request.getParameter("flightBookingNo");
        
        HttpSession session=request.getSession();
        hotel.setFlightBookingNo(Integer.parseInt(flightBookingNo));
        int num=hotel.getFlightBookingNo();
        String flightBookingNumber=Integer.toString(num);
        request.setAttribute("hotel", hotel); // problem can occure regarding scope. beware !
        session.setAttribute("flightBookingNumber", flightBookingNumber);
        if (num!=1234 )
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hotel Module</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Invalid BookingNo</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        else
        {
            request.getRequestDispatcher("HotelBookPage.jsp").forward(request, response);
        } // else ends
        
    }
    else
    {
        Room room=null;
        HttpSession session=request.getSession();
        String type=request.getParameter("roomType");
      room=obj.getRoomByType(type);
        //Room room=hotel.searchRoom(type);
        session.setAttribute("room", room);
        request.getRequestDispatcher("DisplayRoom.jsp").forward(request, response);
        
         /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hotel Module</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>got reqesut from some other page!</h1>");
            out.println("<li>"+pageName+"</li>");
            out.println("</body>");
            out.println("</html>");*/
        
    }
      /*  try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MVCServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MVCServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }*/
        
    } // func ends

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
