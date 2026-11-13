package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice")
public interface ICalculatrice {

    @WebMethod(operationName = "addition",
            action = "http://monservice/ICalculatrice/addition",
            exclude = false)
    int addition(
            @WebParam(name = "a", mode = WebParam.Mode.IN, header = false) int a,
            @WebParam(name = "b", mode = WebParam.Mode.IN, header = false) int b
    );

    @WebMethod(operationName = "soustraction",
            action = "http://monservice/ICalculatrice/soustraction",
            exclude = false)
    int soustraction(
            @WebParam(name = "a", mode = WebParam.Mode.IN, header = false) int a,
            @WebParam(name = "b", mode = WebParam.Mode.IN, header = false) int b
    );

    @WebMethod(operationName = "multiplication",
            action = "http://monservice/ICalculatrice/multiplication",
            exclude = false)
    int multiplication(
            @WebParam(name = "a", mode = WebParam.Mode.IN, header = false) int a,
            @WebParam(name = "b", mode = WebParam.Mode.IN, header = false) int b
    );

    @WebMethod(operationName = "division",
            action = "http://monservice/ICalculatrice/division",
            exclude = false)
    double division(
            @WebParam(name = "a", mode = WebParam.Mode.IN, header = false) int a,
            @WebParam(name = "b", mode = WebParam.Mode.IN, header = false) int b
    );
}