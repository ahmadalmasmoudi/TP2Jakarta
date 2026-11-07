package service;

import jakarta.jws.WebService;

@WebService(name="CalculatriceWS",serviceName = "CalculatriceService",portName="CalculatricePort",endpointInterface="service.ICalculatrice")
public class CalculatriceWS implements ICalculatrice{
    @Override
    public int addition(int a,int b){
        return a+b;
    }
}