/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.servicios;

import co.usa.ciclo3.sbciclo3.repositorio.ComputerRepositorio;
import co.usa.ciclo3.sbciclo3.modelo.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author angys
 */
@Service
public class ServiciosComputer {
    @Autowired
    private ComputerRepositorio metodosCrud;
    
    public List<Computer> getAll(){
        return metodosCrud.getAll();
    }
    
    public Computer getById(int idComputer) {
        Optional<Computer> computer = metodosCrud.getById(idComputer);
        return computer.orElse(new Computer());
    }
    
    public Computer save(Computer computer){
        if (computer.getIdComputer()==null) {
            return metodosCrud.save(computer);
        }else{
           Optional<Computer> evt=metodosCrud.getById(computer.getIdComputer());
            if (evt.isPresent()) {
            return metodosCrud.save(computer);    
            }else{
                return computer;
            }
        }
    }
 }
