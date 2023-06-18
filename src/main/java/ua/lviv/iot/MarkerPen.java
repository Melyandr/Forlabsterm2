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
       MarkerPen(String id, String brand,String colour,String material,int size,String typeOfMarker,int numMarker){
           super(id,brand,colour,material,size);
           this.numMarker=numMarker;
           this.typeOfMarker=typeOfMarker;


     }
    @Override
    public String toString(){
        return  "\nid " + getId() +
                "\nbrand " + getBrand() +
                "\ncolour " + getColour() +
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
    public String getHeaders(){
        return super.getHeaders()+","+"numMarker"+","+"typeOfMarker";
    }
    public String toCSV(){

        return  super.toCSV() +","+numMarker+","+typeOfMarker;
    }
}
