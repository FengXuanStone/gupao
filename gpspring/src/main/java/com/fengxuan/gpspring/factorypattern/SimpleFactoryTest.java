package com.fengxuan.gpspring.factorypattern;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        ICourse course = CourseFactory.create(JavaCourse.class);

        ICourseFactory iCourseFactory = new PythonCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();

        iCourseFactory = new JavaCourseFactory();
        iCourse = iCourseFactory.create();
        iCourse.record();
    }
}
