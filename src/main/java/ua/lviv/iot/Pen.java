package ua.lviv.iot;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter


public abstract class Pen {
    private String id="isn-101";
    private String brand;
    private String colour;
    private String material;
    private int size;




    abstract int calculatePrice();



}
