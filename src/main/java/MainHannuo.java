/**
 * 类名称: MainHannuo
 * 类描述: TODO
 * 创建人: xcTang
 * 创建时间: 2021/8/18 15:20
 * Version 1.0.0
 */
public class MainHannuo {

    public static void main(String[] args) {
        hannuo(3,'a','b','c');
    }

    public  static void hannuo(int n , char one ,char two,char three) {
        if(n==1)
        {
            move(one,three);
        }else
        {
            hannuo(n-1,one,three,two);
            move(one,three);
            hannuo(n-1,two,one,three);
        }
    }

    public static void move(char from ,char to) {
        System.out.print("从"+from+"移动到"+to);
        System.out.println();
    }


}
