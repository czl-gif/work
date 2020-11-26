import factory.factory;
import factory.SolidFact;
import factory.HollowFact;
import pojo.abst;

import java.util.Scanner;

public class test {
    public static void main(String args[]){
        System.out.println("请输入要绘制的图形类型\n" +
                "0：空心\n" +
                "1：实心\n");
        Scanner input=new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println("请输入要绘制的图形\n" +
                "1：圆形\n" +
                "2：矩形\n" +
                "3：三角形\n");
        int num = input.nextInt();
        if(n1 == 0){
            factory f = new HollowFact();
            abst a = f.crate(num);
            a.draw();
        }
        else{
            factory f = new SolidFact();
            abst a = f.crate(num);
            a.draw();
        }
    }
}
