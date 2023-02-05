import java.util.ArrayList;
import java.util.List;

public class TaskSimpleArray3 {
    public static void main(String[] args) {
        // Создаем список точек
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));
        points.add(new Point(7, 8));
        points.add(new Point(9, 10));

        // Находим среднее значение координат X и Y
        double sumX = 0;
        double sumY = 0;
        for (Point point : points) {
            sumX += point.x;
            sumY += point.y;
        }
        double centerX = sumX / points.size();
        double centerY = sumY / points.size();

        // Находим радиус окружности
        double maxRadius = 0;
        for (Point point : points) {
            double radius = Math.sqrt(Math.pow(point.x - centerX, 2) + Math.pow(point.y - centerY, 2));
            if (radius > maxRadius) {
                maxRadius = radius;
            }
        }

        // Выводим результаты
        System.out.println("Центр окружности: (" + centerX + ", " + centerY + ")");
        System.out.println("Радиус окружности: " + maxRadius);
    }
}

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
