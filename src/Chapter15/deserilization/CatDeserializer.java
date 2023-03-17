package Chapter15.deserilization;

import Chapter15.json.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CatDeserializer {
    public static Cat deserializeJsonToCat(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json.getBytes(),Cat.class);
        } catch (IOException e) {
            return null;
        }

    }
}
