package ua.lviv.iot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Files;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import ua.lviv.iot.PenWriter;

import ua.lviv.iot.PenManager;

import static org.junit.jupiter.api.Assertions.*;

class PenWriterTest {
    private PenWriter writer;
    static final String Result_filename = "result.csv";

    static final String Expected_filename = "pen.csv";
    List<Pen> penList = new ArrayList<>();
    SchoolPen schoolpen = new SchoolPen("isn-101", "Lexi", "grey", "plastic", 3, 4, 5, 5);
    OfficerPen officerPen = new OfficerPen("isn-101", "MVS", "black", "skin", 3, 1, 4, 4);
    OfficerPen officerPen2 = new OfficerPen("isn-101","MVS","brown", "skin", 3, 2, 5, 2);
    FelttipPen felttipPen2 = new FelttipPen("isn-101","Fert","orange", "cotton", 3, "Kite", 15);
    PenWriterTest() throws IOException {
    }
    @BeforeEach
    public void setUp() throws IOException {
        writer = new PenWriter();
    }

    @Test
    void emptyWriteToFileTest() throws IOException {
        List<Pen> ListEmpty = new ArrayList<>();


        assertThrows(IllegalArgumentException.class,
                ()->{
                    writer.writeToFile(ListEmpty,"wwwv.csv");
                });
    }


    @Test
    void testWriteListOfPens() throws IOException {

        PenWriter mypens = new PenWriter();
        penList.add(schoolpen);
        penList.add(officerPen);
        mypens.writeToFile(penList,Result_filename);

        Path expected = new File(Expected_filename).toPath();
        Path actual = new File(Result_filename).toPath();

        assertEquals(-1L, Files.mismatch(actual, expected));

    }
    @Test
    public void testFileOverride() throws IOException{

        PenWriter mypens2 = new PenWriter();
        List <Pen> testList= new ArrayList<>();
        testList.add(new SchoolPen("isn-101","Lexi","grey","plastic",3,4,5,5));
        testList.add(new SchoolPen("isn-101","Lexi","black","plastic",3,2,1,2));
        testList.add(new MarkerPen("isn-101","Kite","yeloow", "cloth", 2, "for school", 4));
        mypens2.writeToFile(testList,Result_filename);
        testWriteListOfPens();
//        List<Pen> overList=new ArrayList<>();
//        File overFile = new File("over.csv");
//        PrintWriter over = null;
//        over= new PrintWriter(new FileWriter(overFile));
//        overList.add(schoolpen);
//        overList.add(officerPen);
//        mypens2.writeToFile(overList,);
//        PenWriter overpenwriter=new PenWriter();
//        overpenwriter.writeToFile(overList);
//           if (csvFile.exists()){
//               String Over_filename="over.csv";
//               assertEquals(-1L,Files.mismatch(Path.of(Expected_filename),Path.of(Over_filename)));
//           }
//           else{
//               System.out.println("the  files are different");

    }}

