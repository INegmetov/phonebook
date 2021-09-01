package com.example.phonebook.core.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto {
    @ApiModelProperty("Id записи")
    private Long id;
    @ApiModelProperty("Номер телефона")
    private String phoneNumber;

}
