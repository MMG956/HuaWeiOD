package huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HJ1 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String num;
       while ((num = br.readLine()) != null){
           String[] strs = num.split("\\.");

           if (Integer.valueOf(strs[1]) >= 0.5){
               System.out.println(Integer.valueOf(strs[0]) + 1);
           }else {
               System.out.println(Integer.valueOf(strs[0]));
           }
       }
    }
}
