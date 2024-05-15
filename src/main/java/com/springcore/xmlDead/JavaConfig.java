package com.springcore.xmlDead;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public DataHub getDataHub(){
        DataHub s = new DataHub();
        return s;
    }
}
