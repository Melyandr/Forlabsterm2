package ua.lviv.iot;

import lombok.*;

@AllArgsConstructor
@ToString
//@NoArgsConstructor
@Getter
@Setter


public abstract class Pen {
    private String id="isn-101";
    private String brand;
    private String colour;
    private String material;
    private int size;

   public  Pen (){
       this.brand=brand;
       this.colour=colour;
       this.size=size;
       this.material=material;

   }
   @Override
    public String toString(){
        return  "\ncolour " + colour +
                "\nmaterial " + material +
                "\nsize" + size+
                "\ncolor" + colour+
                "\nid" + id;
    }


    abstract int calculatePrice();

    public String getHeaders(){

       return "id"+","+"brand"+","+"colour"+","+"material"+","+"size";

    };
    public String toCSV(){
        return id+","+brand+","+colour+","+material+","+size;
    }
}
