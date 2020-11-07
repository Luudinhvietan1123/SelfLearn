package DiepTranVanJavaNangCao;

public class Lesson1_Test {
    public static void main(String[] args) throws Lesson1_DevideByZero{
        float sum = Lesson1_Calculator.Divide(5, 0);
        System.out.println("Sum = " + sum);
    }
}
