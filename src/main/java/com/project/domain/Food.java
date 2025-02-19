package com.project.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Food {
    private Long foodId;    // 음식id
    private String foodNm;  // 음식명
    private String image;   // 음식 이미지
    private String description; // 설명
    private Long foodLevel; // 난이도
    private Long cookingtime;   // 조리시간
    private LocalDateTime regDt;    // 등록일
    private LocalDateTime updDt;    // 수정일
}
