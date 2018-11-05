package com.nf147.pet.dao;

import com.nf147.pet.entity.Category;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer c_id);

    int insert(Category record);

    Category selectByPrimaryKey(Integer c_id);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}