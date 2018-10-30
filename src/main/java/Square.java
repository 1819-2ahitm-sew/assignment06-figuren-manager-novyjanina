public class Square extends Figure {

    private double sideA = 0d;

    public Square(double sideA){
        this.sideA=sideA;
    }

    @Override public double area(){
        return Math.pow(sideA,2);
    }

    @Override public double circumference() {
        return sideA * 4;
    }

    @Override public String output(){
        return "Quadrat mit der Seitenlaenge "+sideA+": Flaeche => "+roundResult(area())+", Umfang => "+roundResult(circumference());
    }
}
