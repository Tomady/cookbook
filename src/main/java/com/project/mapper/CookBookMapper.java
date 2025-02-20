package com.project.mapper;

import com.project.domain.FoodVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CookBookMapper {
    @Select("select * from tb_food")
    public List<FoodVO> getList();
}
