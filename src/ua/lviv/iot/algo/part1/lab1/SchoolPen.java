package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter

public class SchoolPen {
    private String id="isn-101";
    private String brand;
    private String colour;
    private String material;
    private int size;
    private int numPencils;
    private int numPens;
    private int numErasers;

public int  addPencil()
{
return numPencils=numPencils+1;
}
public int addPen()
{
    return numPens=numPens+1;
}
public int removePencil()
{
    if (numPencils > 0)
    {
        return numPencils - 1;
    } else
    {
        System.out.println("without pencil");
    }
    return 0;
}

    public int removePen()
    {
        if (numPens > 0)
        {
            return numPens - 1;

        }
        else
        {
            System.out.println("without pen");
        }
        return 0;
    }


    private  static SchoolPen defaultSchoolPen=new SchoolPen();
    public static SchoolPen getInstance()
    {
        return defaultSchoolPen;
    }

    public static void main(String[] args) {

        SchoolPen schoolPen1 = new SchoolPen("isn-101","nike", "white","tree",5,10,12,2);
        SchoolPen schoolPen2=new SchoolPen();
        SchoolPen schoolPen3=getInstance();
        SchoolPen schoolPen4=getInstance();

        schoolPen1.addPen();
        schoolPen1.addPencil();

        System.out.println(schoolPen1.numPens);
        System.out.println(schoolPen1.numPencils);

        schoolPen2.removePen();
        schoolPen2.removePencil();


        SchoolPen[] schoolpens= new SchoolPen[4];
        schoolpens[0]=schoolPen1;
        schoolpens[1]=schoolPen2;
        schoolpens[2]=schoolPen3;
        schoolpens[3]=schoolPen4;


        int length = 4;
        for (int i = 0; i <length;i++ )
        {
            System.out.println(schoolpens[i]);
        }

        for (int k = 0; k < schoolpens.length; k++) {
            System.out.println(schoolpens.toString());
        }


    }


}


