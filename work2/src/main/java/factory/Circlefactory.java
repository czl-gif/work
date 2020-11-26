package factory;

import pojo.CircleShape;
import pojo.abst;

public class Circlefactory implements factory{
    public abst crate() {
        abst circleShape = new CircleShape(150,150,300,300);
        return circleShape;
    }
}
