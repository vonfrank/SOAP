/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import javax.jws.WebService;

@WebService(endpointInterface = "ws.IClient")
public class IClientImpl implements IClient {
    
    private ArrayList<String> clients;
    
    public IClientImpl(){
        clients = new ArrayList();
        
        clients.add("Henrik");
        clients.add("Søren");
        clients.add("Martin");
        clients.add("Mads");
        clients.add("Susan");
    }

    @Override
    public String getClient(int id) {
        return "Most beautiful person in the world is: " + clients.get(id);
    }
    
}
