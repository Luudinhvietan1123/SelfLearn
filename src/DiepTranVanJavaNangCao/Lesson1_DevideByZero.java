package DiepTranVanJavaNangCao;

public class Lesson1_DevideByZero extends Exception{
    float x, y;

    public Lesson1_DevideByZero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage(){
        return "Exception Divide by Zero";
    }
}
