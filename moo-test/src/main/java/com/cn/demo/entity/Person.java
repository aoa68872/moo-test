package com.cn.demo.entity;

public class Person {

    private String name;
    private Float speed;
    //总移动距离
    public Float totalRemove=0f;
    //200标记距离
    public Float flagRemove=0f;
    //等待时间
    public Long waitTime=0l;


    public Person(String name, Float speed) {
        this.name = name;
        this.speed = speed/60f;
    }

    public String getName() {
        return name;
    }

    public Float getSpeed() {
        return speed;
    }

}
