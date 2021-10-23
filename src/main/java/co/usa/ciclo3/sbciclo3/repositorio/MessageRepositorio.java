/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.repositorio;

import co.usa.ciclo3.sbciclo3.modelo.Message;
import co.usa.ciclo3.sbciclo3.repositorios.crud.interfaceMessage;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angys
 */
@Repository
public class MessageRepositorio {
    @Autowired
    private interfaceMessage crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    
    public Message save(Message message){
    return crud.save(message);
    }
    
    public Optional<Message> getById(int idMessage){
    return crud.findById(idMessage);               
    }
    
}
