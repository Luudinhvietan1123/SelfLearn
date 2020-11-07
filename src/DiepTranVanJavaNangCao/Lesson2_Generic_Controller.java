package DiepTranVanJavaNangCao;

import java.util.ArrayList;

public class Lesson2_Generic_Controller<E> {
    ArrayList<E> list = new ArrayList<>();

    public Lesson2_Generic_Controller(){}

    public void add(E e){
        list.add(e);
    }

    public E get(int index){
        return list.get(index);
    }
}
