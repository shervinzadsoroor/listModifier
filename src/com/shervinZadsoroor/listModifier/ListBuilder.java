package com.shervinZadsoroor.listModifier;

import java.util.*;
import java.util.stream.Collectors;

public class ListBuilder {
    //receives a string list of numbers, converts to integers and returns the List

    public static List<Integer> sortingList(List<String> strList) {
        List<Integer> intList = strList.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        return intList;
    }
}
