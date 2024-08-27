package Assignements;

interface CarModel1 {
    void interiorDesign();
    void exteriorDesign();
}

public class Assign_45_Interface_inside_method implements CarModel1 {

 
    public void interiorDesign() {
        System.out.println("Interior update from previous model");
    }

  
    public void exteriorDesign() {
        System.out.println("Exterior update from previous model");
    }

    public static void main(String[] args) {
        Assign_45_Interface_inside_method a = new Assign_45_Interface_inside_method();
        a.interiorDesign();
        a.exteriorDesign();
    }
}
