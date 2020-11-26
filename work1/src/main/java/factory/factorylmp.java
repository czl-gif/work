package factory;


import pojo.*;
public class factorylmp implements factory{
    @Override
    public abst create(int num) {
        if(num == 1){
            abst lineShipe = new LineShipe(50,30,450,260);
            return lineShipe;
        }
        else if(num == 2) {
            abst rectShipe = new RectShipe(50,50,300,400);
            return rectShipe;
        }
        else if(num == 3) {
            abst circleShape = new CircleShape(150,150,300,300);
            return circleShape;
        }
        return null;
    }

    @Override
    public void delete(int num) {

    }
}
