package ua.lviv.iot.algo.part1.lab2;
import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class FelttipPen extends Pen {
    private String felttip;
    private int numFelttip;
    private static final int priceOfFelttip=15;
     FelttipPen(String colour, String material, int size,String Felttip,int numFelttip){
        this.numFelttip=numFelttip;
        this.felttip =Felttip;
        setColour(colour);
        setMaterial(material);
        setSize(size);}
    @Override
     int calculatePrice() {
        System.out.println("price of FelttipPen  " + numFelttip * priceOfFelttip);
        return 0;
    };
};
