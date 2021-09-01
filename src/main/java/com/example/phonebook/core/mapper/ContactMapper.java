package com.example.phonebook.core.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {

        /*
         * задаем настройки маппера для того что бы не реализовывать маппинг внутри сервиса
         * */

    }
}
