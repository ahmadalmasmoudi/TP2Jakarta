package client;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import service.ICalculatrice;
import java.net.URL;

public class ClientCalculatrice {

    public static void main(String[] args) {

        try {
            URL wsdlURL = new URL(
                    "http://localhost:8080/Calculatrice?wsdl"
            );

            QName serviceName = new QName(
                    "http://service/",
                    "CalculatriceService"
            );

            QName portName = new QName(
                    "http://service/",
                    "CalculatricePort"
            );

            Service service = Service.create(
                    wsdlURL, serviceName
            );

            ICalculatrice calculatrice =
                    service.getPort(portName, ICalculatrice.class);

            System.out.println("Addition : "
                    + calculatrice.addition(11, 56));

            System.out.println("Soustraction : "
                    + calculatrice.soustraction(20, 30));

            System.out.println("Multiplication : "
                    + calculatrice.multiplication(5, 5));

            System.out.println("Division : "
                    + calculatrice.division(20, 5));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}