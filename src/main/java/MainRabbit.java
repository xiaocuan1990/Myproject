/**
 * 类名称: MainRabbit
 * 类描述: TODO
 * 创建人: xcTang
 * 创建时间: 2021/8/18 10:00
 * Version 1.0.0
 */
public class MainRabbit {


    public static void main(String[] args) {
        ditui();
        System.out.println();
        bankQuMoney();
    }
    public static void ditui(){
        int num[]= new int [12];
        num[0] = 1;
        num[1] = 1;
        //这里使用2是因为0和1都为1。0和1为已知数量
        for(int i=2;i<12;i++)
        {
            num[i] = num[i-1]+num[i-2];
        }
        for(int i = 0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }

    public static void bankQuMoney(){

        final int FETCH = 1000;
        final float RATE= 0.0171f;

        float  [] corpus = new float [48];
        corpus[47] = FETCH;
        for(int i=46;i>=0;i--)
        {
            corpus[i] = (corpus[i+1]+FETCH)/(1+RATE/12);
        }

        for(int i = 0;i<corpus.length;i++)
        {
            System.out.println("第"+(i+1)+"个月"+corpus[i]);
        }

    }


}
