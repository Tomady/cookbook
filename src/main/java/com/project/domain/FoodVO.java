package com.project.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
public class FoodVO {
    private Long foodId;    // 음식id
    private String foodNm;  // 음식명
    private String image;   // 음식 이미지
    private String description; // 설명
    private Long foodLevel; // 난이도
    private Long cookingtime;   // 조리시간
    private Date regDt;    // 등록일
    private Date modiDt;    // 수정일
    private String title;   // 타이틀
}
