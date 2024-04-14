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

        FileUtils.write(new File("task_nine.txt"), "Достоинством подобного способа выполнения программ является \n" +
                "полная независимость байт-кода от операционной системы и оборудования, \n" +
                "что позволяет выполнять Java-приложения на любом устройстве, \n" +
                "для которого существует соответствующая виртуальная машина. Другой \n" +
                "важной особенностью технологии Java является гибкая система безопасности, \n" +
                "в рамках которой исполнение программы полностью контролируется виртуальной машиной. \n" +
                "Любые операции, которые превышают установленные полномочия программы (например, попытка \n" +
                "несанкционированного доступа к данным или соединения с другим компьютером), \n" +
                "вызывают немедленное прерывание. \n" +
                "Часто к недостаткам концепции виртуальной машины относят снижение производительности. \n" +
                "Ряд усовершенствований несколько увеличил скорость выполнения программ на Java:");

        String string1;

        string1 = FileUtils.readFileToString(new File("task_nine.txt"), StandardCharsets.UTF_8);
        string1.replaceAll("[^a-zA-Z0-9]", " ");
        String[] wordArrayLineTask = string1.split(" +");
        Map<String, Integer> map = new HashMap();

        int temp = 0;

        for (int i = 0; i < wordArrayLineTask.length; i++){
            for (int j = 1; j < wordArrayLineTask.length; j++){
                if (wordArrayLineTask[i].equals(wordArrayLineTask[j])){
                    map.put(wordArrayLineTask[i],temp++);
                } else {
                    map.put(wordArrayLineTask[i],temp);
                }
            }
            temp = 0;
        }

        System.out.println(map.toString());








    }
}
