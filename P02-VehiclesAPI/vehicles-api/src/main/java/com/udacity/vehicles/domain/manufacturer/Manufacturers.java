package com.udacity.vehicles.domain.manufacturer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Manufacturers {
    public  static  final Manufacturer[] manufacturers= new Manufacturer[]{
            new Manufacturer(100, "Audi"),
            new Manufacturer(101, "Chevrolet"),
            new Manufacturer(102, "Ford"),

            new Manufacturer(103, "BMW"),
        new Manufacturer(104, "Dodge")};
     
    public static Manufacturer getRandomMan(){
        Integer manCode= new Random().nextInt(5);
        return manufacturers[manCode];
        
    }
    
    
    
    
    
}
