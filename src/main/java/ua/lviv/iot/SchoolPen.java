package ua.lviv.iot;

import lombok.*;

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
    public int removePencil() {
        int kilkist = 0;
        if (numPencils > 0) {
            System.out.println(numPencils - 1);
            kilkist = numPencils - 1;
        }
        return kilkist;
    };
    public int removePen() {
        int kilkist = 0;
        if (numPens > 0) {
            System.out.println(numPens - 1);

            kilkist = numPens - 1;
        }
        return kilkist;
    }


    public  static SchoolPen defaultSchoolPen=new SchoolPen();
//    public static SchoolPen getInstance()
//    {
//        return defaultSchoolPen;
//    }
@Override
public String toString(){
    return "\n numPencil " + numPencils +
            "\nnumPens: " + numPens +
            "\nnumErasers " + numErasers ;
}

    @Override
    int calculatePrice() {

        System.out.println("price of schoolpen :"+ numPencils*priceOfPencil+numPens*priceOfPen+numErasers*priceOfEraser);
        return numPencils*priceOfPencil+numPens*priceOfPen+numErasers*priceOfEraser;
    }
}


