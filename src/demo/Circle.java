package demo;

public class Circle {
    private double Radius = 1.0;
    private String color = "red";
     Circle(){

    }
     Circle(double r){
        this.Radius = r;
    }
    double getRadius(){
        return  this.Radius;
    }
    double getArea(){
        return this.Radius*this.Radius*Math.PI;
    }

}
