/**
 * 类名称: MainJiecheng
 * 类描述: TODO
 * 创建人: xcTang
 * 创建时间: 2021/8/18 16:28
 * Version 1.0.0
 */
public class MainJiecheng {

    public static void main(String[] args) {

        System.out.println(jiecheng(6));

    }
    public static int jiecheng(int n){
        if(n<=1)
            return 1;
        else
        {
            return n*jiecheng(n-1);
        }
    }


}
