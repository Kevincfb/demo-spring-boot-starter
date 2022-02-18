package com.sanfu.spring.boot.starter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 * application.xml中以 com.sanfu.demo 为前缀的属性都是属于 sanfudemo-spring-boot-starter的
 * </p>
 *
 * @Author: chenfb
 * @Date: Created in 2021/2/9 14:13
 */
@ConfigurationProperties(prefix = "com.sanfu.demo")
public class SanFuDemoProperties {

    private String name;
    private String desc;
    private String url;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
