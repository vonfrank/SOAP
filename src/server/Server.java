/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.xml.ws.Endpoint;
import ws.*;

/**
 *
 * @author frank
 */
public class Server {
    
    public static void main(String args[]){
        
        Endpoint.publish("http://localhost:8001/ws/service", new IServiceImpl());
        System.out.println("IService is hosted on http://localhost:8001/ws/service");
        Endpoint.publish("http://localhost:8002/ws/client", new IClientImpl());
        System.out.println("IClient is hosted on http://localhost:8002/ws/client");
    }
}
