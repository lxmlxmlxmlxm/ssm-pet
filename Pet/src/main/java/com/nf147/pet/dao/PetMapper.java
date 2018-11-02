package com.nf147.pet.dao;

import com.nf147.pet.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer id);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);
}