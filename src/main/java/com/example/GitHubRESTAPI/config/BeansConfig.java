package com.example.GitHubRESTAPI.config;

import com.example.GitHubRESTAPI.service.dtoservice.DTOConverterImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    // bean will be required to inject as a dependency
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
