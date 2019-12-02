package com.shervinZadsoroor.listModifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number : ");
        List<String> strList = Arrays.asList(input.nextLine().split(""));
        List<Integer> list = ListBuilder.sortingList(strList);
        System.out.println(list);
    }
}
