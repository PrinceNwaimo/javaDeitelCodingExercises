package Chapter17.functionalInteface;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        biConsumer.accept("Felix",77);
        printNameAndAge("Kola",39);

    }
    static BiConsumer<String,Integer> biConsumer = (name,age)-> System.out.println(name + "" +age);
    //This is a declarative method of this imperative you use to know

    public static void printNameAndAge(String name, int age){
        System.out.println(name + ""+age);
    }




}
