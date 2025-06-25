package interfejs;

class ShapeDrawer {

    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        System.out.println("Starting drawing choosen shape...");
        this.shape.draw();
        System.out.println("Shape has been drawn");
    }

}