package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class SchoolPen extends Pen{

    private int numPencils;
    private int numPens;
    private int numErasers;
    private static final int priceOfPen=10;
    private static final int priceOfPencil=7;
    private static final int priceOfEraser=4;

    public int  addPencil()
    {
        return numPencils+=1;
    }
    public int addPen()
    {
        return numPens+=1;
    }
    public int removePencil()
    {
        if (numPencils > 0)
        {
            return numPencils - 1;
        }

        return 0;
    }
    public int removePen()
    {
        if (numPens > 0)
        {
            return numPens - 1;
        }

        return 0;
    }


    public  static SchoolPen defaultSchoolPen=new SchoolPen();
    public static SchoolPen getInstance()
    {
        return defaultSchoolPen;
    }

    @Override
    int calculatePrice() {
        int price=numPencils*priceOfPencil+numPens*priceOfPen+numErasers*priceOfEraser;
        System.out.println("price of schoolpen :"+ price);
        return price;
    }



}


