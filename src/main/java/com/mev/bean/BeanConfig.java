package com.mev.bean;

import com.mev.dto.BeanDto;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton") // request session singleton
    public BeanDto beanDto(){

        return BeanDto
                .builder()
                    .id(0L).beanName("bean Adi").beanData("bean Data")
                .build();
    }

}
