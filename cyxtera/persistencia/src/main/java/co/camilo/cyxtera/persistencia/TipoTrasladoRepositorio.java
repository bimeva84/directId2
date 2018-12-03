/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.camilo.cyxtera.persistencia;

import co.camilo.cyxtera.modelo.TipoTraslado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author cmarin
 */
public interface TipoTrasladoRepositorio extends JpaRepository<TipoTraslado, Integer>{
    
    @Query(value = "SELECT t FROM TipoTraslado t")
    public List<TipoTraslado> obtenerTiposTraslado();
}
