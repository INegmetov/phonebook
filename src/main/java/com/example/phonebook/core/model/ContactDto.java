package com.example.phonebook.core.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto {
    @ApiModelProperty("Id записи")
    private Long id;
    @ApiModelProperty("ФИО")
    private String name;
    @ApiModelProperty("Дата рождения")
    private Date birthday;
    @ApiModelProperty("Номер телефона")
    private PhoneDto phone;
}
