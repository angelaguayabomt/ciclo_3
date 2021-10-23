/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.repositorio;

import co.usa.ciclo3.sbciclo3.modelo.Reservation;
import co.usa.ciclo3.sbciclo3.repositorios.crud.interfaceReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author angys
 */
@Repository
public class ReservationRepositorio {
    @Autowired
    private interfaceReservation crud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }
    
    public Reservation save(Reservation reservation){
    return crud.save(reservation);
    }
    
    public Optional<Reservation> getById(int idReservation){
    return crud.findById(idReservation);               
    }
}
