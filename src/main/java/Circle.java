public class Circle extends Figure {
    private double radius = 0d;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override public double area(){
        return Math.PI * 2 * radius;
    }

    @Override public double circumference() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override public String output(){
        return "Kreis mit dem Radius "+radius+": Flaeche => "+roundResult(area())+", Umfang => "+roundResult(circumference());
    }
}
