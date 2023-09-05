package com.test.java8;

/**
 * Add the Java doc here
 *
 * @author : bhushan.karmarkar@1eq.com
 * @Project : Security service
 * @Date : 12-05-2021
 * @since :
 */

public class LearningLambda {
    public String nonStaticField = "Field Value";
    private static String staticVariable = "Static Value";
    public static void main(String[] args)  {
        LearningLambda learningLambda = new LearningLambda();
        learningLambda.demoLambda();
    }

    private void demoLambda() {
        Vehicle vehicle = (pointOne, pointTwo) -> {
            System.out.println("Moving from "+pointOne+ " to " + pointTwo);
            return 165;
        };
        System.out.println("Distance travelled - "+ vehicle.move("Pune", "Mumbai"));

        AccessVariableDemo accessVariableDemo = () -> {
            String localVariable = "local value";
            System.out.println(staticVariable);
            System.out.println(nonStaticField);
            System.out.println(localVariable);
        };

        accessVariableDemo.printVariables();
    }
}

interface Vehicle {
    int move(String pointOne, String pointTwo);
    default void defaultSoundHorn() {
        System.out.println("Beep Beep");
    };
}

@FunctionalInterface
interface AccessVariableDemo{
    void printVariables();
}


