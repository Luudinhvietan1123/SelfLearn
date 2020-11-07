package DiepTranVanJavaNangCao;

import java.util.*;

public class Lesson2_Collections {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A1");
        list.add("A2");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println();

        list.forEach((item)->{
            System.out.println(item);
        });

        System.out.println();

        list.stream().forEach(System.out::println);

        System.out.println();

        list.parallelStream().forEach(System.out::println);

        Vector<String> list2 = new Vector<>();

        LinkedList<String> list3 = new LinkedList<>();

        System.out.println();

        HashMap<String, String> map = new HashMap<>();
        map.put("fullname", "Luu Dinh Viet An");
        map.put("id", "20186300");

        System.out.println(map.get("id"));

        System.out.println();

        Set<String> keys = map.keySet();
        keys.forEach((key)->{
            System.out.println("key : " + key + " " + map.get(key));
        });

        System.out.println();

        if(map.containsKey("email")){
            System.out.println("Email : " + map.get("email"));
        }else{
            System.out.println("Email : " + "null");
        }

        System.out.println();

        TreeMap<String, Object> tree = new TreeMap<>();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();

        System.out.println();

    }
}
