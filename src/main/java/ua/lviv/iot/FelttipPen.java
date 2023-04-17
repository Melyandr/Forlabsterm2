package ua.lviv.iot;
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
    public String toString(){
         return  "\ncolour " + getColour() +
                "\nmaterial " + getMaterial() +
                "\nsize" + getSize() +
                "\nFelttip" + felttip +
                "\nnumFelttip" + numFelttip;
     }
    @Override
     int calculatePrice() {

        System.out.println( numFelttip * priceOfFelttip);
return numFelttip * priceOfFelttip;
    };
}
