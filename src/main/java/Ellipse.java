public class Ellipse extends Figure {
    private double minorAxis = 0d;
    private double majorAxis = 0d;

    public Ellipse(double majorAxis, double minorAxis){
        this.majorAxis=majorAxis;
        this.minorAxis=minorAxis;
    }

    @Override public double area(){
        return Math.PI * minorAxis * majorAxis;
    }

    @Override public double circumference() {
        return 2*Math.PI*Math.sqrt((Math.pow(minorAxis,2)+Math.pow(majorAxis,2))/2);
    }

    @Override public String output(){
        return "Ellipse mit Hauptachse "+majorAxis+" und Nebenachse "+minorAxis+": Flaeche => "+roundResult(area())+" , Umfang => "+roundResult(circumference());
    }
}
