package com.cn.demo;

import com.cn.demo.entity.Person;

public class TestMain {
    public Double getResult(Person personA, Person personB, int total) {
        double time = 0d;
        while (!(personA.totalRemove - personB.totalRemove - total > 0)) {
            getPersonData(personA);
            getPersonData(personB);
            time++;
        }
        return time/60;
    }

    private static void getPersonData(Person person){
        if (person.flagRemove>200){
            person.waitTime = 120l;
            person.flagRemove = 0f;
        }
        if (person.waitTime > 0){
            person.waitTime --;
        }else {
            person.flagRemove += person.getSpeed();
            person.totalRemove += person.getSpeed();
        }
    }
}
