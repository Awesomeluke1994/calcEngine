package com.lukeliddell;

public class Mainpt3 {
    public static void main(String[] args) {


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.println(equationOverload.getResult());

        //Widening conversion - can convert ints to doubles
        equationOverload.execute(rightInt,rightInt);
        System.out.print("results=");
        System.out.println(equationOverload.getResult());

        //Becuase the double is a narrow conversion into a int - it will choose the one that accepts two doubles.
        equationOverload.execute((double)rightInt,rightInt);
        System.out.print("results=");
        System.out.println(equationOverload.getResult());



//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
    }
}
