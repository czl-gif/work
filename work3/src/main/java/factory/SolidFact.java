package factory;

import pojo.AngleShape1;
import pojo.CircleShape1;
import pojo.RectShape1;
import pojo.abst;

public class SolidFact implements factory {
    public abst crate(int num) {
        abst a = null;
        if(num == 1){
            a = new CircleShape1(150,150,300,300);
        }
        else if(num == 2){
            a = new RectShape1(50,50,300,400);
        }
        else {
            a = new AngleShape1(150,150, 300,150,300,300);
        }
        return a;
    }
}
