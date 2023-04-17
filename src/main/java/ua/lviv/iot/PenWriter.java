package ua.lviv.iot;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class PenWriter {
    List <Pen>list= new ArrayList<>();


    public String writeToFile(List<Pen> list, String path) throws IOException {
        if (list.isEmpty()){
            throw new IllegalArgumentException();}
        PrintWriter out = new PrintWriter(new FileWriter(path));

        list.stream()
                .sorted(Comparator.comparing(Pen::getHeaders))
                .collect(Collectors.groupingBy(Pen::getHeaders))
                .forEach((headers, pens) -> {
                    out.println(headers);
                    pens.forEach(pen -> out.println(pen.toCSV()));
                });

        out.close();


        return path;
    }}





//        public String write (List < Pen > list) throws IOException {
//            if (list == null || list.isEmpty()) {
//                return null;
//            }
//            String defaultFileName = "result.csv";
//            try (FileWriter writer = new FileWriter(defaultFileName)) {
//                for (var pen : list) {
//                    writer.write(pen.getHeaders());
//                    writer.write(System.getProperty("\r\n"));
//                }
//            } catch (IOException e) {
//            }
//            return defaultFileName;
//        }


