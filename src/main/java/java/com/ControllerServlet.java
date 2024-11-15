package java.com;



import java.Bean.CustomerBean;
import java.Bean.FlightBean;
import java.Bean.SeatBean;
import java.DBLayer.DBHandler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ControllerServlet"})
public class ControllerServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControllerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControllerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
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
        doPost(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // processRequest(request, response);
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String customerName=request.getParameter("name");  
        String customerPassportNumber=request.getParameter("passport");  
        String customerID=request.getParameter("customerid");  
        String customerPhone=request.getParameter("phone");  
        String customerAddress=request.getParameter("address");  
        String flightNumber=request.getParameter("flightnumber");
        String departureDate=request.getParameter("depdate");    
       
       
          
        CustomerBean customerBean = new CustomerBean();
        customerBean.setCustomerID(customerID);
        customerBean.setCustomerName(customerName);
        customerBean.setCustomerPassportNumber(customerPassportNumber);
        customerBean.setCustomerPhone(customerPhone);
        customerBean.setCustomerAddress(customerAddress);
        
        SeatBean seatBean = new SeatBean();
        seatBean.setBookingNumber();
        int bookNumber = seatBean.getBookingNumber();
        seatBean.setObj(customerBean);
        
        FlightBean flightBean = new FlightBean();
        
        flightBean.setFlightNumber(flightNumber);
        flightBean.setDepartureDate(departureDate);
        //need destination and departure time
        DBHandler.getDestination(flightBean, flightNumber);
        
        flightBean.setSeatList(seatBean);
        
        boolean status = true;
        
        String st = DBHandler.addBookingToDatabase(flightBean,bookNumber);
        
        //LoginBean bean=new LoginBean();
        //bean.setName(name);
        //bean.setPassword(password);
        request.setAttribute("bean",flightBean);
        request.setAttribute("status", st);
          
        //boolean status=bean.validate();
          
        if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }  
      
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
