package com.cangle.common.config;

import com.cangle.hapimity.utils.ShortCodeGenerator;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


/**
 * @author raorui
 */
@Configuration
@EnableConfigurationProperties(CodeGeneratorConfigurationProperties.class)
public class CodeGeneratorConfiguration {
    @Resource
    private CodeGeneratorConfigurationProperties properties;

    @Bean(name = "shortCode")
    public ShortCodeGenerator createCodeGenerator(){
        return new ShortCodeGenerator(properties.getCenterid(),properties.getMachineid());
    }
}
