public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        figureBox.add(circle1);
        Triangle triangle1 = new Triangle(13,41,24);
        figureBox.add(triangle1);
        Rectangle rectangle1 = new Rectangle(40, 50);
        figureBox.add(rectangle1);

        figureBox.searchFigure(circle1);
        figureBox.getInfo(0);

        figureBox.searchFigure(triangle1);
        figureBox.getInfo(1);

        figureBox.searchFigure(rectangle1);
        figureBox.getInfo(2);

    }
}