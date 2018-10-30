public class Figure_Manager {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Square(3),
                new Ellipse(10, 6),
                new Circle(5),
                new Triangle(10,3,5),
                new Rectangle(5,3),
        };

        System.out.println("*** DATENANZEIGE ***");
        System.out.println("--------------------");
        System.out.println();

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] instanceof Square){
                Square square = (Square) figures[i];
                System.out.println(square.output());

            }else if (figures[i] instanceof Ellipse){
                Ellipse ellipse = (Ellipse) figures[i];
                System.out.println(ellipse.output());

            }else if (figures[i] instanceof Circle){
                Circle circle = (Circle) figures[i];
                System.out.println(circle.output());

            }else if (figures[i] instanceof Triangle){
                Triangle triangle = (Triangle) figures[i];
                System.out.println(triangle.output());

            }else if (figures[i] instanceof Rectangle){
                Rectangle rectangle = (Rectangle) figures[i];
                System.out.println(rectangle.output());
            }
        }

    }
}
