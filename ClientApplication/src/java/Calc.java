

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.ws.WebServiceRef;
import serv.Calculator_Service;


/**
 *
 * @author koken
 */
public class Calc extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhots8080/ServerApplication/Calculator.wsdl")
    private Calculator_Service service;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
         PrintWriter out = response.getWriter();
           
         String v = request.getParameter("nam");
         String v1 = request.getParameter("nam1");
         int n = Integer.parseInt(v);
         int m = Integer.parseInt(v1);
         out.println("Additions is=="+add(n,m));
         out.println("Subraction is=="+sub(n,m));
         out.println("Division is=="+div(n,m));
         out.println("Multiplication is=="+mult(n,m));
    }
        private int add(int arg0, int arg1){
        serv.Calculator port = service.getCalclator();
        return port.add(arg0, arg1);
        }
        private int div(int arg0, int arg1){
        serv.Calculator port = service.getCalclator();
        return port.add(arg0, arg1);
        }
        private int mult(int arg0, int arg1){
        serv.Calculator port = service.getCalclator();
        return port.add(arg0, arg1);
        }
        private int sub(int arg0, int arg1){
        serv.Calculator port = service.getCalclator();
        return port.add(arg0, arg1);
        }
}
