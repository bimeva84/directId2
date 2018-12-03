/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.camilo.cyxtera.servicios;

import co.camilo.cyxtera.modelo.Client;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 *
 * @author carojas
 */
@Service
public interface ClientsService {
    
    /**
     * Metodo encargado de buscar los tipos de traslado parametrizados.
     * @return Lista de @link{TipoTraslado}
     */
    public List<Client> getClients();
    public Client postClient(Client cliente);
}
