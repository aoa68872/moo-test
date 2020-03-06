package com.cn.test;

import static org.junit.Assert.assertTrue;

import com.cn.demo.TestMain;
import com.cn.demo.entity.Person;
import org.junit.Test;


public class DemoTest
{
    @Test
    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        Person personA = new Person("personA",60f);
        Person personB = new Person("personB",40f);
        System.out.println("The time is:"+String.format("%.2f",testMain.getResult(personA,personB,800)));
    }
}
