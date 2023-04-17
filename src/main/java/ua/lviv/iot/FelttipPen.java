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
     FelttipPen(String id, String brand,String colour,String material,int size,String Felttip,int numFelttip){
         super(id,brand,colour,material, size);
        this.numFelttip=numFelttip;
        this.felttip =Felttip;

     }

@Override
    public String toString(){
         return  "\nid " + getId() +
                 "\nbrand " + getBrand() +
                 "\ncolour " + getColour() +
                "\nmaterial " + getMaterial() +
                "\nsize" + getSize() +
                "\nFelttip" + felttip +
                "\nnumFelttip" + numFelttip;
     }
    @Override
     int calculatePrice() {

        System.out.println( numFelttip * priceOfFelttip);
        return numFelttip * priceOfFelttip;
    }
    public String getHeaders(){
         return super.getHeaders()+","+"numFelttip"+","+"Felttip";
    }
    public String toCSV(){
         return super.toCSV()+","+numFelttip+","+felttip;
    }
}
