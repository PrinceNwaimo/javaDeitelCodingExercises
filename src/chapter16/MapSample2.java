package chapter16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample2 {
    public static void main(String[] args) {
        Map<String,String[]> nigerianStates = new HashMap<>();
        nigerianStates.put("Zamfara",new String[]{"Anka","Gusau"});//Key = state ,values = capital
        nigerianStates.put("Sokoto",new String[]{"Sokoto","Gambe"});
        nigerianStates.put("Abia",new String[]{"Umuahia","Aba"});
        nigerianStates.put("Akwa-Ibom",new String[]{"Uyo","Ikot-Ekpene"});//Keys cannot be duplicated but values can.

        var set = nigerianStates.entrySet();
        nigerianStates.keySet().forEach(K->Arrays.sort(nigerianStates.get(K)));

        nigerianStates.forEach((key,value)-> System.out.println(key+"  : "+ Arrays.toString(value)));

    }
}
