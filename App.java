public class App {
    public static void main(String[] args) {
       // toDo
       Circle circle = new Circle(2.0);
       Rectangle rectangle = new Rectangle(10.0,10.0);
       Triangle triangle = new Triangle(10.0,10.0);
       ausgabe("---- Flächen -----");
       ausgabe("Fläche Kreis: " + circle.area());
       ausgabe("fläche Rechteck: " + rectangle.area());
       ausgabe("Fläche Dreieck: " + triangle.area());
       ausgabe("-----Differenzen-----");
       ausgabe("Diff. r/t:" + areaDiff(rectangle, triangle));
       ausgabe("Diff. r/c: " + areaDiff(rectangle, circle));

    }

    //Rechteck - Dreieck//
public static double areaDiff(Rectangle r, Triangle t) {
    return r.area() - t.area();
}

//Shape - Shape//
public static double areaDiff(Shape s1, Shape s2) {
    return s1.area() - s2.area();
    
}





    public static void ausgabe(String outStr ){       
        System.out.println(outStr);
    }

}
