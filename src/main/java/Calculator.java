public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2){

        this.number1= number1;
        this.number2 = number2;
    }

    public int getAdd(){
        return this.number1+this.number2;
    }

    public int getMultiply(){
        return this.number1*number2;
    }

    public int getDivide(){
        return this.number1/number2;
    }

    public int getSubtract(){
        return this.number1-this.number2;
    }


}
