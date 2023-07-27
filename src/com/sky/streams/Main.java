package com.sky.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Saad");
        students.add("Ahmad");
        students.add("Zack");
        students.add("Henvor");
        students.add("Henvor");
        Stream<String> s = students.stream().sorted().distinct();
        List<String> res = s.collect(Collectors.toList());
        res.forEach(x -> System.out.println(x));
    }
}
