package com.lukeliddell;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'a';

        if(opCode == 'a'){
            result = val1 + val2;
        } else if(opCode == 's' ){
            result = val1 - val2;
        } else if(opCode == 'd'){
            result = val2 != 0.0d ? val1 / val2 : 0.0d
//            Same line of code as above.
//            if(val2 != 0.0d){
//                result = val1 / val2
//            } else {
//                result = 0.0d; //if the results is devided by zero show zero.
//            }
        } else if(opCode == 'm'){
            result = val1*val2;
        } else {
            System.out.println("Error - invalid opCode");
            result = 0.0d;
        }

        System.out.println(result);
    }
}
