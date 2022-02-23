
package serv;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author koken
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    
    @WebMethod
    public int add(int a, int b) {
    int c;
    c = a + b;    
        return c;
    }
    @WebMethod
    public int sub(int a, int b) {
    int c;
    c = a - b;    
        return c;
    }
    @WebMethod
    public int mult(int a, int b) {
    int c;
    c = a * b;    
        return c;
    }
    @WebMethod
    public int div(int a, int b) {
    int c;
    c = a / b;    
        return c;
    }
}
