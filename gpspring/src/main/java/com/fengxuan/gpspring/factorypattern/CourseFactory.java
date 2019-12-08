package com.fengxuan.gpspring.factorypattern;

public class CourseFactory {
//    public static ICourse create(String name) {
//        if("Java".equals(name)) {
//            return new JavaCourse();
//        } else if("Python".equals(name)) {
//            return new PythonCourse();
//        } else {
//            return null;
//        }
//    }

//    public static ICourse create(String className) {
//        try {
//            if(!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    public static ICourse create(Class<? extends ICourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
