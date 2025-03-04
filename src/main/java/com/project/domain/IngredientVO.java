package com.project.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IngredientVO {
    private Long ingredientId;    // 재료id
    private Long foodId;  // 음식id
    private String ingredientNm;   // 재료명
    private String amount; // 양
    private String ingType; // 단위 
    private String category;   // 주재료,양념재료 분류 

}
