package com.academy.homework_nine;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {

        File task_nine ;

        FileUtils.write(new File("task_nine.txt"), "один, ТЕСТ! бум тест БУМ. бум");

        String string1;

        string1 = FileUtils.readFileToString(new File("task_nine.txt"), StandardCharsets.UTF_8);
        String string2 = string1.toLowerCase().replaceAll("\\p{P}", " ");
        System.out.println(string2);
        String[] wordArrayLineTask = string2.split(" +");
        Map<String, Integer> map = new HashMap();


        int a = 1;

        for (String word : wordArrayLineTask){
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, a);
            }
        }

        System.out.println(map.toString());








    }
}
