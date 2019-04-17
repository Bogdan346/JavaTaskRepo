package Task_6_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
//    1.Создать hashMap и добавить в него несколько  обьектов
//            .Вывести в консоль все данные
    public static void main(String[] args) {
        Map<String  ,Integer>map =new HashMap<String, Integer>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);

        for (Map.Entry<String  ,Integer>e :map.entrySet())
        {   System.out.println( e.getValue() );

            System.out.println( e.getKey() );
        }
    }
}
