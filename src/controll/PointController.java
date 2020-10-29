package controll;

import object.Point;

public class PointController {

    int addX(Point point){
       return point.getX() + 1;
    }
    int minusX(Point point){
        return point.getX() - 1;
    }
    int addY(Point point){
        return point.getY() + 1;
    }
    int minusY(Point point){
        return point.getY() - 1;
    }
}
