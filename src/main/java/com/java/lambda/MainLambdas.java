package com.java.lambda;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainLambdas {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Start: " +start.getNano());
        List<String> names = Arrays.asList("thomas","kris","bolek","lolek");
        new MainLambdas().printListMyInterface(names, str -> System.out.println(str) );
        new MainLambdas().printList(names, str -> System.out.println(str));

        System.out.println( "Time: "+  (LocalDateTime.now().getNano() - (start.getNano())));
    }

    public  void printListMyInterface(List<String> list, StringConsumer consumer){
        for (String str:list){
            consumer.consumeString(str);
        }
    }

    public  void printList(List<String> list, Consumer<String> consumer){
        for (String str: list) {
            consumer.accept("consumer "+str);
        }
    }
}
