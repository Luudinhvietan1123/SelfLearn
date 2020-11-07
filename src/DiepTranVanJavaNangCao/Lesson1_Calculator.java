package DiepTranVanJavaNangCao;

public class Lesson1_Calculator {
    public static float Divide(int x, int y) throws Lesson1_DevideByZero{
        if(y == 0){
            throw new Lesson1_DevideByZero(x, y);
        }
        return x/y;
    }
    public static float Plus(float x, float y){
        return x + y;
    }
}
