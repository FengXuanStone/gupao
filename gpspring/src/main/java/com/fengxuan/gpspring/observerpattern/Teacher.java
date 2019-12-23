package com.fengxuan.gpspring.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;
    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("==============");
        System.out.println(name + "老师， 您好！收到了一个来自" + gper.getName() + "的问题， 希望您解答" +
                ". 问题如下：" + question.getContent() + ",提问者:" + question.getUserName());
    }
}
