package chapter16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample1 {
    public static void main(String[] args) {
        Map<String,String> nigerianStates = new HashMap<>();
        nigerianStates.put("Zamfara","Gusau");//Key = state ,values = capital
        nigerianStates.put("Sokoto","Sokoto");
        nigerianStates.put("Abia","Umuahia");
        nigerianStates.put("AkwaIbom","Uyo");//Keys cannot be duplicated but values can.

        System.out.println("map-->" + nigerianStates);

    }
}
