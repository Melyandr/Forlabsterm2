package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
import java.util.ArrayList;
import java.util.List;



public  class PenManager {


    static List<Pen> list = new ArrayList<>();
    public static Pen addPen(final Pen pen)                                                //second level
    {
        list.add(pen);
        return pen;
    };

    public static  void main(String[] args) {

        SchoolPen schoolpen1 = new SchoolPen(4, 5, 6);
        SchoolPen schoolpen2 = new SchoolPen(6, 8, 6);

        MarkerPen markerpen1 = new MarkerPen("yeloow", "cloth", 2, "for school", 4);
        MarkerPen markerpen2 = new MarkerPen("red", "cloth", 4, "for school", 10);

        OfficerPen officerPen1 = new OfficerPen("black", "skin", 3, 1, 4, 4);
        OfficerPen officerPen2 = new OfficerPen("brown", "skin", 3, 2, 5, 2);

        FelttipPen felttipPen1 = new FelttipPen("black", "cotton", 2, "Kite", 10);
        FelttipPen felttipPen2 = new FelttipPen("orange", "cotton", 3, "Kite", 15);

        System.out.println("output price");
        schoolpen1.calculatePrice();
        markerpen1.calculatePrice();
        officerPen1.calculatePrice();
        felttipPen1.calculatePrice();


        System.out.println(" ");



        list.add(schoolpen1);
        list.add(schoolpen2);

        list.add(markerpen1);
        addPen(markerpen2);

        addPen(felttipPen1);
        addPen(felttipPen2);

        addPen(officerPen1);
        addPen(officerPen2);

        for (Pen element : list) {
            System.out.println(element.toString());
        }

        System.out.println("  ");
        System.out.println("lambda expression!!!!!!!!!!");

        list.stream()
                .filter(i -> i.getMaterial() == "cotton")
                .forEach(System.out::println);

         System.out.println(" ");
         System.out.println(" second lambda expression!!!!!!!!!!");
         list.stream()
                 .filter(i->i.getSize()>3)
                 .forEach(System.out::println);


        }

    }





