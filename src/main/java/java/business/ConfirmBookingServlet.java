
package java.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ConfirmBookingServlet", urlPatterns = {"/ConfirmBookingServlet"})
public class ConfirmBookingServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        BookedRoom bookedRoom=new BookedRoom();
        Hotel hotel=null;
        hotel=hotel.getHotelInstance();;//=new Hotel();
        
        HttpSession session = request.getSession();
        
        PrintWriter out = response.getWriter();
        String fbn=request.getParameter("flightBookingNo");
        int flightBookingNo=Integer.parseInt(fbn);
        // using business logic
        Room room=(Room) session.getAttribute("room");
        
        bookedRoom.setRoom(room);
        bookedRoom.setFlightBookingNo(flightBookingNo);
        ///////// need to save objecy in db
        
        hotel.BookRoom(bookedRoom);
        PersistentClass obj=new PersistentClass();
        obj.saveBookedRoom(bookedRoom);
        // trial//
        BookedRoom bkr=new BookedRoom();
        bkr=obj.searchBookedRoom(1234);
       // if (bkr==null)
       //      out.println("<h1>null object!!!!</h1>");
       // else
        //     out.println("<h1>its not  ull!</h1>");
        // trial ends
        
        
        //
        String type=bookedRoom.getRoom().getType();
       int rent=bookedRoom.getRoom().getRent();
       //int x=bkr.getRoom().getRent();
        //////////////////////////////////
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Booking Done for:</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>done!</h1>");
            out.println("<li>"+bkr.getFlightBookingNo()+"</li>");
            
         // out.println("<li>"+x+"</li>");
            //out.println("<li>"+bkr.getRoom().getRoomNo()+"</li>");
            /*out.println("<li>"+type+"</li>");
            out.println("<li>"+rent+"</li>");
            out.println("<li>"+fbn+"</li>");*/
            out.println("</body>");
            out.println("</html>");
        
        //////////////////////////////////
        
        
       
        //request.getAttribute(null)
       // Room taskBean = (Room) request.getAttribute("room");
        
    }

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
