package Chapter8;

import java.awt.*;
import java.util.Objects;

public enum Geo_Political_Zones {
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Borno", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Niger", "Plateau"}),
    SOUTH_EAST(new String[]{"Abia", "Imo", "Ebonyi", "Enugu", "Anambra"}),
    SOUTH_WEST(new String[]{"Lagos", "Ogun", "Oyo", "Ondo", "Ekiti", "Osun"}),
    SOUTH_SOUTH(new String[]{"Rivers", "Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo"});


    private String[] states;

    Geo_Political_Zones(String[] states) {
        this.states = states;
    }


    public static Geo_Political_Zones getStates(String stateName) {
        for (Geo_Political_Zones nigeria : Geo_Political_Zones.values()) {
            for (String i : nigeria.states) {
                if (i.equalsIgnoreCase(stateName))
                    return nigeria;
            }

        }
        return null;
    }



    }




