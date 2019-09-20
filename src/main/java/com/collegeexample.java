package com;

public class collegeexample {

    public static void main(String[] args)
    {
        //Arithmetic arithmetic= new Arithmetic();
        //System.out.println("SUM :  " + arithmetic.add(12,14));
        //System.out.println("SUB : "+ arithmetic.sub(12, 14));
        //System.out.println("MUlTI: " + arithmetic.multiply(12,14) );
        //System.out.println("DIVIDE :  " + arithmetic.divide(12,14) );;


        student S1=new student();
        S1.setFirstName("simar");
        S1.setLastName("mahi");

        S1.setMarks1(40);
        S1.setMarks2(60);
        S1.setMarks3(60);
        S1.setMarks4(60);
        S1.setMarks5(60);
        System.out.println(S1.getFullName());
        S1.generateResult();


    }


}


