import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    static private ArrayList<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }
    // Метод для добавления новой фигуры
    public void add(IShape figure){
        toolbox.add(figure);

    }
    // Метод для удаления фигуры
    public void remove(IShape figure){
        toolbox.remove(figure);
    }

    // Метод поиска необходимой фигуры
    public void searchFigure(IShape figure){

            if(toolbox.contains(figure)){
                System.out.println(figure + " присутствует в списке!");
            } else System.out.println(figure + " отсутствует в списке!");
    }

    // Метод отображения подробной информации о фигуре
    public void getInfo(int num) {
        IShape figure = toolbox.get(num);
        if(figure instanceof Circle){
            System.out.println("Круг с параметрами:");
            System.out.println(toolbox.get(num).getArea());
            System.out.println(toolbox.get(num).getPerimeter());
        }
        if(figure instanceof Rectangle){
            System.out.println("Прямоугольник с параметрами:");
            System.out.println(toolbox.get(num).getArea());
            System.out.println(toolbox.get(num).getPerimeter());
        }
        if(figure instanceof Triangle){
            System.out.println("треугольник с параметрами:");
            System.out.println(toolbox.get(num).getArea());
            System.out.println(toolbox.get(num).getPerimeter());
        }


    }

    //...
}
