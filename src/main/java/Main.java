/**
 * 类名称: Main
 * 类描述: TODO
 * 创建人: xcTang
 * 创建时间: 2021/7/31 21:06
 * Version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        fiveTest();
    }

    public static void fiveTest(){

        int j ,i[] = new int []{0,0,0,0};  //表示4个运算符的代号
        int sign;
        int count = 0;
        int num[] = new int []{5,5,5,5,5,5};
        float result = num [5];
        char oper [] = new char[]{'+','-','*','/'};//表示运算符
        for(i[0]=0; i[0]<4;i[0]++) {
            if(i[0]<3||num[1]!=0) {
                for(i[1]=0; i[1]<4;i[1]++) {
                    if (i[1] < 3 || num[2] != 0) {
                        i[2] = 0;
                        for ( ; i[2] < 4;) {
                            if (i[2] < 3 || num[3] != 0) {
                                for (i[3] = 0; i[3] < 4; i[3]++) {
                                    if (i[3] < 3 || num[4] != 0) {
                                        //这里一定要设置为float 因为有可能出现5/5/5==0的情况，一旦设置为int 就有可能出现5/5/5/5==0的情况，而设置为float可以避免把小数当成0来运算
                                        float left = 0;
                                        float right = num[1];
                                        sign = 1;
                                        for (int ko = 0; ko < i.length; ko++) {
                                            switch (oper[i[ko]]) {
                                                case '+':
                                                    left = left + sign * right;
                                                    sign = 1;
                                                    right = num[ko + 1];
                                                    break;
                                                case '-':
                                                    left = left + sign * right;
                                                    sign = -1;
                                                    right = num[ko + 1];
                                                    break;
                                                case '*':
                                                    right = right * num[ko + 1];
                                                    break;
                                                case '/':
                                                    right = right / num[ko + 1];
                                                    break;
                                            }
                                        }
                                        if (left + sign * right == result) {
                                            System.out.println("第" + count + "个 " + num[0] + "" + oper[i[0]] + "" + num[1] + "" + oper[i[1]] + "" + num[2] + "" + oper[i[2]] + "" + num[3] + "" + oper[i[3]] + "" + num[4] + "=" + result);
                                            count++;
                                        }
                                    }


                                }
                            }
                            i[2]++;
                        }

                    }
                }
            }
        }
        if(count == 0)
        {
            System.out.println("没有结果");
        }else
        {
            System.out.println("结果有："+count+"个");
        }
    }






}
