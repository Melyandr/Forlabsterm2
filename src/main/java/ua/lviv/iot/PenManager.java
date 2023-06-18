package ua.lviv.iot;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public  class PenManager {


    static List<Pen> list = new ArrayList<>();

    public static Pen addPen(final Pen pen)
    {
        list.add(pen);
        return pen;
    }

    public static void main(String[] args) throws IOException {


        SchoolPen schoolpen1 = new SchoolPen("isn-101","Lexi","grey","plastic",3,4,5,5);
        SchoolPen schoolpen2 = new SchoolPen("isn-101","Lexi","black","plastic",3,2,1,2);

        MarkerPen markerpen1 = new MarkerPen("isn-101","Kite","yeloow", "cloth", 2, "for school", 4);
        MarkerPen markerpen2 = new MarkerPen("isn-101","Kite","red", "cloth", 4, "for school", 10);

        OfficerPen officerPen1 = new OfficerPen("isn-101","MVS","black", "skin", 3, 1, 4, 4);
        OfficerPen officerPen2 = new OfficerPen("isn-101","MVS","brown", "skin", 3, 2, 5, 2);

        FelttipPen felttipPen1 = new FelttipPen("isn-101","Fert","black", "cotton", 2, "Kite", 10);
        FelttipPen felttipPen2 = new FelttipPen("isn-101","Fert","orange", "cotton", 3, "Kite", 15);

        addPen(markerpen2);

        addPen(felttipPen1);
        addPen(felttipPen2);

        addPen(officerPen1);
        addPen(officerPen2);
        PenWriter mypens= new PenWriter();

        mypens.writeToFile(list,"manager.csv");


    }
}

