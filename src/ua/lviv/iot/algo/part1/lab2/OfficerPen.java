package ua.lviv.iot.algo.part1.lab2;
import lombok.*;
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter

public class OfficerPen extends Pen{
     private int curvimeter;
    private int numMaps;
    private int numCopybooks;
    private static final int priceOfMaps=50;
    private static final int priceOfcurvimetr=35;
    private static final int priceOfCopebooks=12;

    OfficerPen(String colour, String material, int size, int curvimeter, int numMaps, int numCopybooks){
        this.curvimeter=curvimeter;
        this.numMaps=numMaps;
        this.numCopybooks=numCopybooks;
        setColour(colour);
        setMaterial(material);
        setSize(size);};
    @Override
    public int calculatePrice() {
        int price=numMaps*priceOfMaps+curvimeter*priceOfcurvimetr+numCopybooks*priceOfCopebooks;
        System.out.println("price of officer penal "+ price);

        return price;
    }
}
