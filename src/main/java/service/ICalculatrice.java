
package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice")
public interface ICalculatrice{
    @WebMethod(operationName="addition",action="http://monservice/ICalulatrice/addtion",exclude=false)
    int addition(@WebParam(name="a",mode=WebParam.Mode.IN,header =false)int a,@WebParam(name="b",mode=WebParam.Mode.IN,header =false) int b);
}