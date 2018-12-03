/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.camilo.cyxtera.web.dto;

/**
 *
 * @author crojas
 */
public class RespuestaDto {
    /**
     * Respuesta Obtenida por el servicio.
     */
    private Object respuesta;
    
    public RespuestaDto(Object respuesta){
        this.respuesta = respuesta;
    }

    /**
     * @return the respuesta
     */
    public Object getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(Object respuesta) {
        this.respuesta = respuesta;
    }
}
