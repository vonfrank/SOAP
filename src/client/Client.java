/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import ws.*;

/**
 *
 * @author frank
 */
public class Client {
    
    public static void main(String args[]) throws Exception{
        
        URL urlIService = new URL("http://localhost:8001/ws/service?wsdl");
        QName qnameIService = new QName("http://ws/", "IServiceImplService");
        Service serviceIService = Service.create(urlIService, qnameIService);
        IService iservice = serviceIService.getPort(IService.class);
        System.out.println(iservice.getMessage("Hello world"));
        
        URL urlIClient = new URL("http://localhost:8002/ws/client?wsdl");
        QName qnameIClient = new QName("http://ws/", "IClientImplService");
        Service serviceIClient = Service.create(urlIClient, qnameIClient);
        IClient iclient = serviceIClient.getPort(IClient.class);
        System.out.println(iclient.getClient(4));
    }
}
