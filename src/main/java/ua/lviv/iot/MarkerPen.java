package ua.lviv.iot;

import lombok.*;



@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter

public class MarkerPen extends Pen {
    private String typeOfMarker;
    private int numMarker;
    private static final int priceOfMarker=12;
       MarkerPen(String colour,String material,int size,String typeOfMarker,int numMarker){
         this.numMarker=numMarker;
         this.typeOfMarker=typeOfMarker;
         setColour(colour);
         setMaterial(material);
         setSize(size);

     }
    @Override
    public String toString(){
        return  "\ncolour " + getColour() +
                "\nmaterial " + getMaterial() +
                "\nsize" + getSize() +
                "\ntypeOfMarker" + typeOfMarker +
                "\nnumnumMarker" + numMarker;
    }

    @Override
    int calculatePrice() {

        System.out.println("price of markers "+numMarker*priceOfMarker);
        return numMarker*priceOfMarker ;
    }
}
