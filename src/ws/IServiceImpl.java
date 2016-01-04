/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.IService")
public class IServiceImpl implements IService {

    @Override
    public String getMessage(String message) {
        return "Server says: " + message;
    }
    
}
