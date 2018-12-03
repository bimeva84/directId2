/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.camilo.cyxtera.controlador;

import co.camilo.cyxtera.modelo.Client;
import co.camilo.cyxtera.web.dto.RespuestaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.camilo.cyxtera.servicios.ClientsService;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author carojas
 */
@RestController
@RequestMapping("/clients")
public class clientController {
    
    @Autowired
    private ClientsService clientsService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity getClients() {
        
        RespuestaDto respuesta = new RespuestaDto(clientsService.getClients());
        
        return new ResponseEntity(respuesta, HttpStatus.OK);
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity setClients(@RequestBody Client dto) {
        
        RespuestaDto respuesta = new RespuestaDto(clientsService.postClient(dto));
        
        return new ResponseEntity(respuesta, HttpStatus.CREATED);
    }
    
}
