package com.fengxuan.gpspring.factorypattern;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
