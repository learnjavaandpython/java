

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //List<String> list = method1(n,m);
        List<String> list = method2(n,m);
        for(String value : list){
            System.out.println(value);
        }
    }

    /**
     * 方法一：
     * @param n  开始位置
     * @param m  结束位置
     * @return
     */
    public static List<String> method1(int n,int m){
        List<String> list = new ArrayList<String> ();
        for(int i=n;i<=m;i++){
            if(i%5==0 && i%3 == 0){
                //System.out.println("FizzBuzz");
                list.add("FizzBuzz");
            }else if(i%5==0){
                //System.out.println("Buzz");
                list.add("Buzz");
            }else if(i%3 == 0){
                //System.out.println("Fizz");
                list.add("Fizz");
            }else{
                //System.out.println(Integer.toString (i));
                list.add(String.valueOf(i));
            }
        }
        return list;
    }


    /**
     * 方法二：  调用numToWord()实现
     * @param n 开始位置
     * @param m 结束位置
     * @return
     */
    public static List<String> method2(int n,int m){
        List<String> list = new ArrayList<String>();
        for(int i=n; i <= m; i++){
            String word = numToWord(i,5,"Buzz")+numToWord(i,3,"Fizz");
            if(StringUtils.isEmpty(word)){
                word = Integer.toString(i);
            }
            list.add(word);
        }
        return list;
    }

    /**
     * 数字转单词，不符合规则的转成""
     * @param num     被除数
     * @param divisor  除数
     * @param word    对应单词
     * @return
     */
    public static String numToWord(int num, int divisor,String word){
        return num%divisor==0 ? word : "";
    }
}