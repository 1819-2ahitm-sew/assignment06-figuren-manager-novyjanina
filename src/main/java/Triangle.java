public class Triangle extends Figure {
    private double sideA = 0d;
    private double sideB = 0d;
    private double sideC = 0d;

    public Triangle (double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override public double area(){
        return (sideA * sideB)/2;
    }

    @Override
    public double circumference() {
        return sideA + sideB +sideC;
    }

    @Override public String output(){
        return "Dreieck mit der Laenge "+sideA+", der Breite "+sideB+" und der Hoehe "+sideC+" : Flaeche => "+roundResult(area())+", Umfang=> "+roundResult(circumference());
    }
}
