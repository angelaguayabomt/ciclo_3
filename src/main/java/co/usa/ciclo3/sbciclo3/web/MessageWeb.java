/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.web;

import co.usa.ciclo3.sbciclo3.modelo.Message;
import co.usa.ciclo3.sbciclo3.servicios.ServiciosMessage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author angys
 */
@RestController
@RequestMapping("/api/Message")
public class MessageWeb {
    @Autowired
    private ServiciosMessage servicios;
    
    @GetMapping("/all")
    private List<Message> getAll(){
        return servicios.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message){
        return servicios.save(message);
    }   
}
