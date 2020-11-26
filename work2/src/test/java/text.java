import factory.factory;
import pojo.abst;
import factory.Linefactory;
import factory.Rectfactory;
import factory.Circlefactory;
import java.util.Scanner;

public class text {
    public static void main(String args[]){
        System.out.println("请输入要绘制的图形\n" +
                "1：直线\n" +
                "2：矩形\n" +
                "3：圆形\n");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        factory f = null;
        if(n == 1) {
            f = new Linefactory();
        }
        else if(n == 2) {
            f = new Rectfactory();
        }
        else
            f = new Circlefactory();
        abst a = f.crate();
        a.draw();
    }
}
