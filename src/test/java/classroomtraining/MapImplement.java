package classroomtraining;

import java.util.HashMap;
import java.util.Map;

public class MapImplement {
    public static void main(String[] args) {

        Map<String,Integer> empDetails=new HashMap<String,Integer>();

        //add the values to the map

        empDetails.put("Prathap",75000);
        empDetails.put("Pradeep",74000);
        empDetails.put("Krish",68000);
        empDetails.put("Raj",27000);


//        System.out.println(empDetails.get("Pradeep"));


        System.out.println(empDetails.containsKey("Prathap"));

        empDetails.remove("Prathap");
//                for(Map.Entry<String,Integer> map:empDetails.entrySet()){
//
//            System.out.println(map.getKey()+"-----"+map.getValue());
//
//        }

        empDetails.put("Prathap",empDetails.get("Pradeep"));

    }
}