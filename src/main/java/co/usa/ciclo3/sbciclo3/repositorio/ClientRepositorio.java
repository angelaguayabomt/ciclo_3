/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.repositorio;

import co.usa.ciclo3.sbciclo3.modelo.Client;
import co.usa.ciclo3.sbciclo3.repositorios.crud.interfaceClient;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angys
 */
@Repository
public class ClientRepositorio {
    @Autowired
    private interfaceClient crud;
    
    public List<Client> getAll(){
        return (List<Client>) crud.findAll();
    }
    
    public Client save(Client client){
    return crud.save(client);
    }
    
    public Optional<Client> getById(int idCategory){
    return crud.findById(idCategory);               
    }
}
