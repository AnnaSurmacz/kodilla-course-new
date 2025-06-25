package interfejs;

class Application {

public static void main(String args[]) {
    Shape circle = new Circle();
    ShapeDrawer shapeDrawer1 = new ShapeDrawer(circle);

    shapeDrawer1.process();

    Shape triangle = new Triangle();
    ShapeDrawer shapeDrawer2 = new ShapeDrawer(triangle);
    shapeDrawer2.process();

}

}