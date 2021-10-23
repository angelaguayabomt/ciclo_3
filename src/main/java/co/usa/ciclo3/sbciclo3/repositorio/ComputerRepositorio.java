/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.repositorio;

import co.usa.ciclo3.sbciclo3.repositorios.crud.interfaceComputer;
import co.usa.ciclo3.sbciclo3.modelo.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angys
 */
@Repository
public class ComputerRepositorio {
    @Autowired
    private interfaceComputer crud;
    
    public List<Computer> getAll(){
        return (List<Computer>) crud.findAll();
    }
    
    public Computer save(Computer computer){
    return crud.save(computer);
    }
    
    public Optional<Computer> getById(int idComputer){
    return crud.findById(idComputer);               
    }

}
