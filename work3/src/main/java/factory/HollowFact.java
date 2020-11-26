package factory;

import pojo.AngleShape;
import pojo.CircleShape;
import pojo.RectShape;
import pojo.abst;

public class HollowFact implements factory{

    public abst crate(int num) {
        abst a = null;
        if(num == 1){
            a = new CircleShape(150,150,300,300);
        }
        else if(num == 2){
            a = new RectShape(50,50,300,400);
        }
        else {
            a = new AngleShape(150,150, 300,150,300,300);
        }
        return a;
    }
}
