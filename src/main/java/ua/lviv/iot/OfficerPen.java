package ua.lviv.iot;
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

    OfficerPen(String id, String brand, String colour, String material, int size, int curvimeter, int numMaps, int numCopybooks) {
        super(id,brand,colour,material,size);
        this.curvimeter = curvimeter;
        this.numMaps = numMaps;
        this.numCopybooks = numCopybooks;

    }
    @Override
    public String toString(){
        return  "\nid " + getId() +
                "\nbrand " + getBrand() +
                "\ncolour " + getColour() +
                "\nmaterial " + getMaterial() +
                "\nsize" + getSize() +
                "\ncurvimeter" + curvimeter +
                "\nnumMaps" + numMaps +
                "\nnumCopybooks" + numCopybooks;
    }
    @Override
    public int calculatePrice() {
        int price=numMaps*priceOfMaps+curvimeter*priceOfcurvimetr+numCopybooks*priceOfCopebooks;
        System.out.println("price of officer penal "+ price);

        return price;
    }
    public String getHeaders(){
        return super.getHeaders()+","+ "curvimeter"+","+"numMaps"+","+"numCopybooks";
    }
    public String toCSV(){
        return super.toCSV()+","+curvimeter+","+numMaps+","+numCopybooks;
    }
}
