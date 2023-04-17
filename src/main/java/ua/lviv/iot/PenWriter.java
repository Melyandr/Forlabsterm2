package ua.lviv.iot;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PenWriter {
    List <Pen>list= new ArrayList<>();


    public String writeToFile(List<Pen> list, String path) {
        if (list.isEmpty()){
            throw new IllegalArgumentException();}
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(path));


            for (Pen pen : list) {
                out.println(pen.getHeaders());
                out.println(pen.toCSV());

            }
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


        return null;
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


