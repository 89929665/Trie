package com.cn.jmw.data.source.pojo.common;

/**
 * @author jmw
 * @Description TODO
 * @date 2022年09月28日 17:02
 * @Version 1.0
 */
public enum AbstractFactoryEnum {
    DRUID("DRUID"),
    HIKARI("HIKARI");

    String jdbc;
    AbstractFactoryEnum(String jdbc) {
        this.jdbc = jdbc;
    }

    public Integer getIntegerValue(){
        return Integer.valueOf(this.jdbc);
    }

    public String getStringValue(){
        return jdbc;
    }
}