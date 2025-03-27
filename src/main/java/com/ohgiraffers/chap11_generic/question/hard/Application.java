package com.ohgiraffers.chap11_generic.question.hard;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        MultiBox<String, Integer> multiBox = new MultiBox<>();
        multiBox.setFirstData("Hello");
        multiBox.setSecondData(100);
        System.out.println(multiBox.printData());


//        DataProcessor<Number> processor = new DataProcessor();

        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.addData(10);
        dataProcessor.addData(20.5);
        dataProcessor.addData(30);
        dataProcessor.addData(40.7);

        System.out.println(dataProcessor.processData());
    }
}
