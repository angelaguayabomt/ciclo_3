/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.sbciclo3.web;

import co.usa.ciclo3.sbciclo3.modelo.Category;
import co.usa.ciclo3.sbciclo3.servicios.ServiciosCategory;
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
@RequestMapping("/api/Category")
public class CategoryWeb {
    @Autowired
    private ServiciosCategory servicios;
    
    @GetMapping("/all")
    private List<Category> getAll(){
        return servicios.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return servicios.save(category);
    }
}
