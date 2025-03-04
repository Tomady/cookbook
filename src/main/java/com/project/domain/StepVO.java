package com.project.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StepVO {
	
    private Long stepId;    // 스탭id
    private Long foodId;  // 음식id
    private String stepNum;   // 스탭명
    private String stepImage; // 스탭사진
    private String stepDescription; // 스탭설명
   
}
