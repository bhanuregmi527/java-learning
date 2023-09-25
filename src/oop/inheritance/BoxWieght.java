package oop.inheritance;

public class BoxWieght extends Box {
    double weight;

    public BoxWieght(double l, double h, double w, double weight) {
        super(l, h, w);//call the parent class constructor
        //used to initialise values present in parent class
        this.weight = weight;
    }
}
