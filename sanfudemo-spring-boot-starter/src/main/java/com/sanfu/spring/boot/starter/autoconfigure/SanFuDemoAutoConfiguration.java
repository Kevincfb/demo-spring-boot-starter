package com.sanfu.spring.boot.starter.autoconfigure;

import com.sanfu.demo.SanFuDemo;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 这个starter的配置属性也是来源于被引用的项目中的application.xml，
 * 所以在自动配置类SanFuDemoAutoConfiguration上添加注解@EnableConfigurationProperties(SanFuDemoProperties.class)，
 * 以此启用配置属性SanFuDemoProperties。
 * </p>
 *
 * @Author: chenfb
 * @Date: Created in 2021/2/9 14:13
 */
@Configuration
@EnableConfigurationProperties(SanFuDemoProperties.class)
public class SanFuDemoAutoConfiguration {

    @Bean
    public SanFuDemo getSanFuDemo(SanFuDemoProperties properties) {
        SanFuDemo sanFuDemo = new SanFuDemo();
        sanFuDemo.setName(properties.getName());
        sanFuDemo.setUrl(properties.getUrl());
        sanFuDemo.setDesc(properties.getDesc());
        return sanFuDemo;
    }
}
