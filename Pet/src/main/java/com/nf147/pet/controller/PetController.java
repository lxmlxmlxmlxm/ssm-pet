package com.nf147.pet.controller;


import com.nf147.pet.dao.CategoryMapper;
import com.nf147.pet.dao.PetMapper;

import com.nf147.pet.dao.TagMapper;
import com.nf147.pet.entity.Category;
import com.nf147.pet.entity.Pet;
import com.nf147.pet.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;


@Controller
@RequestMapping("/pet")
public class PetController {


    @Autowired
    private PetMapper petMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    /*private  MultipartFile mfile;*/


    @RequestMapping(method = RequestMethod.GET)
    public String selectAll(Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pets", pets);
        List<Category> categories = categoryMapper.selectAll();
        model.addAttribute("categories",categories);
        return "petHome";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update() {

        return "";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(Pet pet)  {
        petMapper.insert(pet);
       //System.out.println(mfile.getName());
       //System.out.println(mfile.getOriginalFilename());
        return "redirect:/pet";
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

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String delpetId(@PathVariable("id") int id) {
        petMapper.deleteByPrimaryKey(id);
        return "redirect: /pet";
    }


}
