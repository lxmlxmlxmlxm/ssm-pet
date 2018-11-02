package com.nf147.pet.controller;


import com.nf147.pet.dao.PetMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/pet")
public class PetController {


    @Autowired
    private PetMapper petMapper;


    @RequestMapping(method = RequestMethod.POST)
    public String selectAll() {
        return "";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update() {
        return "";
    }

    @RequestMapping(value = "/findByStatus", method = RequestMethod.GET)
    public String findByStatus() {
        return "";

    }

    @RequestMapping(value = "/{petId}", method = RequestMethod.GET)
    public String getpetId(@PathVariable("petId") int petId) {
        return "";
    }

    @RequestMapping(value = "/{petId}", method = RequestMethod.POST)
    public String postpetId(@PathVariable("petId") int petId) {
        return "";
    }

    @RequestMapping(value = "/{petId}", method = RequestMethod.DELETE)
    public String delpetId(@PathVariable("petId") int petId) {
        return "";
    }


}
