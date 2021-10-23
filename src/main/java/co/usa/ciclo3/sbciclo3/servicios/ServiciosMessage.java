/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.servicios;

import co.usa.ciclo3.sbciclo3.modelo.Message;
import co.usa.ciclo3.sbciclo3.repositorio.MessageRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angys
 */
@Service
public class ServiciosMessage {
    @Autowired
    private MessageRepositorio metodosCrud;
    
    public List<Message> getAll(){
        return metodosCrud.getAll();
    }
    
    public Message getById(int idMessage) {
        Optional<Message> message = metodosCrud.getById(idMessage);
        return message.orElse(new Message());
    }
    public Message save(Message message){
        if (message.getIdMessage()==null) {
            return metodosCrud.save(message);
        }else{
           Optional<Message> evt=metodosCrud.getById(message.getIdMessage());
            if (evt.isPresent()) {
            return metodosCrud.save(message);    
            }else{
                return message;
            }
        }
    }
    
}
