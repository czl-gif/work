package factory;

import pojo.LineShape;
import pojo.abst;

public class Linefactory implements factory {
    public abst crate() {
        abst lineShape = new LineShape(50,30,450,260);
        return lineShape;
    }
}
