package com.nf147.pet.controller;


import com.nf147.pet.dao.PetMapper;

import com.nf147.pet.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping("/pet")
public class PetController {


    @Autowired
    private PetMapper petMapper;


    @RequestMapping(method = RequestMethod.GET)
    public String selectAll(Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets",pets);
        return "petHome";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update() {

        return "";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(Pet pet) {
         petMapper.insert(pet);
        return "redirect: /pet";
    }
    @RequestMapping(value = "/findByStatus", method = RequestMethod.GET)
    public String findByStatus() {
        return "";

    }

    @RequestMapping(value = "/{petId}", method = RequestMethod.GET)
    public String getpetId(@PathVariable("petId") int petId) {
        return "";
    }

    @RequestMapping(value = "/{petId}", method = RequestMethod.DELETE)
    public String postpetId(@PathVariable("petId") int petId) {
        return "";
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public String delpetId(@PathVariable("id") int id) {
        petMapper.deleteByPrimaryKey(id);
        return "redirect: /pet";
    }


}
