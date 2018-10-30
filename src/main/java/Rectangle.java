public class Rectangle extends Figure {

    private double sideA = 0d;
    private double sideB = 0d;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override public double area(){
        return sideA * sideB;
    }

    @Override
    public double circumference() {
        return  sideA * 2 + sideB * 2;
    }

    @Override public String output(){
        return "Rechteck mit der Laenge "+sideA+" und der Breite "+sideB+" : Flaeche => "+roundResult(area())+", Umfang => "+roundResult(circumference());
    }

}
