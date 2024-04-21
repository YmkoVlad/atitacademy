package com.academy.homework_nine;

import com.academy.homework_eight.Student;
import com.academy.homework_nine.functional_interface.INumber;
import com.academy.homework_nine.functional_interface.INumberTwo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {


        //task1 Считать с одного файла текст, посчитать количество каждого слова в тексте и записать результат в другой текстовый файл.
        // Чтобы убрать знаки препинания и оставить в тексте только буквы и цифры, используйте для вашей стринги .replaceAll("[^a-zA-Z0-9]", " ")

        File task_nine = new File("src/main/task_nine.txt");
        FileUtils.write(task_nine, "один, ТЕСТ! бум тест БУМ. бум");

        String readStringFromFile;
        String sortString;
        String[] sortWordsToArray;

        readStringFromFile = FileUtils.readFileToString(new File("src/main/task_nine.txt"), StandardCharsets.UTF_8);
        sortString = readStringFromFile.toLowerCase().replaceAll("\\p{P}", " ");
        System.out.println(sortString); //для проверки
        sortWordsToArray = sortString.split(" +");

        Map<String, Integer> map = new HashMap();

        for (String word : sortWordsToArray) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map.toString()); //для проверки

        File wordCount = new File("src/main/wordCount.txt");
        FileUtils.write(wordCount, map.toString());

        //task2 Напишите свой функциональный интерфейс с генериком и напишите лямбда функцию для него
        INumber<Integer, Integer> sumNumber = x -> x << 1; //удваеваем в 2 раза
        System.out.println(sumNumber.workNumber(2));
        INumberTwo<Double, Double, Double> divisionNumbers = (x, y) -> x / y;
        System.out.println(divisionNumbers.workNumber(19.0, 2.0));
        INumberTwo<Integer, Integer, Integer> divisionNumbersInteger = (x, y) -> x / y;
        System.out.println(divisionNumbersInteger.workNumber(19, 2));
        System.out.println();

        //task3Используйте стрим для коллекции и попрактикуйтесь следующие методы:
        //- map(interface Function)
        //- sorted(interface Comparator)
        //- filter(interface Predicate)
        //- forEach(interface Consumer)
        //- count
        //- toList
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.println("MyList = " + myList.toString());
//        Удалить кто заканчивается на “1”
        List<String> notOne = myList.stream().filter(a -> !a.endsWith("1")).collect(Collectors.toList());
        notOne.forEach(System.out::print);
        System.out.println();
//        Сортировка
        List<String> sortList = myList.stream().sorted((a1, a2) -> {
            if (a1.charAt(1) > a2.charAt(1)) {
                return 1;
            } else if (a1.charAt(1) == a2.charAt(1)) {
                return 0;
            } else {
                return -1;
            }
        }).sorted((a1, a2) -> {
            if (a1.charAt(0) > a2.charAt(0)) {
                return 1;
            } else if (a1.charAt(0) == a2.charAt(0)) {
                return 0;
            } else {
                return -1;
            }
        }).collect(Collectors.toList());
        sortList.forEach(System.out::println);
        System.out.println();

        //тут просто пробовал

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Vasja");
        hashMap.put(2, "Petja");
        hashMap.put(3, "Nastya");
        hashMap.put(4, "Dasha");
        hashMap.put(5, "Dima");
        hashMap.put(6, "Petja");

        List<String> listForTest = new ArrayList<>();
        listForTest.add("Vlad");
        listForTest.add("Dima");
        listForTest.add("Nastya");
        listForTest.add("Petja");
        listForTest.add("Adnrey");
        System.out.println();

        listForTest.stream().forEach(x -> System.out.println(x));
        List<String> newList = listForTest.stream().sorted()
                .map(x -> x + " Privet").collect(Collectors.toList());
        System.out.println();
        System.out.println("Noviu list s privet i otsortirovan");
        newList.forEach(System.out::println);
        System.out.println();

        List<String> newListTwo = listForTest.stream()
                .filter(x -> !x.startsWith("V"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("bez Vlad i v UpperCase");
        newListTwo.forEach(System.out::println);











    }



}
