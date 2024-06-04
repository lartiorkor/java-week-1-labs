package task_4;

public class Division {
    public double divide(int num1, int num2){
        try{
            if (num2 == 0)
                throw new ArithmeticException("Division by zero");

        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
        return (double) num1 / num2;
    }
}
