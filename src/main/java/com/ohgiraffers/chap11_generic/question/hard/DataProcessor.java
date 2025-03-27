package com.ohgiraffers.chap11_generic.question.hard;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    private List<? extends Number> dataList = new ArrayList<>();

    public DataProcessor() {
    }

    public void addData(Number data) {

        List<Number> newDataList = new ArrayList<>(dataList);
        newDataList.add(data);
        dataList = newDataList;

    }

    public List<? extends Number> processData() {
        return dataList;
    }
}

//public class DataProcessor<T extends Number> {
//    private List<T> dataList = new ArrayList<>();
//
//    public void addData(T data) {
//        dataList.add(data);
//    }
//
//    public List<T> processData() {
//        return dataList;
//    }
//}
