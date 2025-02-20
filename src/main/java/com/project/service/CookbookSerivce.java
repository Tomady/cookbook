package com.project.service;

import com.project.domain.FoodVO;
import com.project.mapper.CookBookMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class CookbookSerivce {
    private CookBookMapper mapper;

    public List<FoodVO> getList() {
        log.info("food getList.......");

        return mapper.getList();
    }
}
