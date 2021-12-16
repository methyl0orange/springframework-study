package com.wxc.bean;

import org.springframework.context.annotation.Bean;


public class AnnotationTestBean {
    private String time;
    private String sex;

    public AnnotationTestBean(String time, String sex) {
        this.time = time;
        this.sex = sex;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "AnnotationTestBean{" +
                "time='" + time + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
