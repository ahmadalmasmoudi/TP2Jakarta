package service;

import jakarta.jws.WebService;

@WebService(
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        endpointInterface = "service.ICalculatrice"
)
public class CalculatriceWS implements ICalculatrice {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return (double) a / b;
    }
}