package Chapter15.deserilization;

import Chapter15.json.Cat;
import Chapter15.json.CatSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {

    String catJson;

    @BeforeEach
    void setUP(){
//        catJson = CatSerializer.convertCatToJson();
    }
    @Test
    void deserializeJsonToCat(){
         Cat hill = CatDeserializer.deserializeJsonToCat(catJson);
         assertNotNull(hill);
         assertEquals("Tom",hill.getName());
    }

}