package com.company;

public class Main {

    public static void main(String[] args) {
        int number = (int) (Math.random()*100)+1;
        System.out.println(number+",");

        if(number <= 25){
            System.out.println(number+" is less than or equal to 25");
        }

        else if(number > 25 && number < 50){
            System.out.println(number+" is between 25 and 50");
        }

        else{
            System.out.println(number+" is larger than or equal 50");
        }


        }

    }


