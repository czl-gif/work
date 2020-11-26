package factory;

import pojo.RectShape;
import pojo.abst;

public class Rectfactory implements factory {
    public abst crate() {
        abst rectShape = new RectShape(50,50,300,400);
        return rectShape;
    }
}
