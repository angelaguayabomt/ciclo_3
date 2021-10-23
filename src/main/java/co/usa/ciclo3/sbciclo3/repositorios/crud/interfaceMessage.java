/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.repositorios.crud;

import co.usa.ciclo3.sbciclo3.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author angys
 */
public interface interfaceMessage extends CrudRepository<Message,Integer>{
    
}
