package algorithm;

import algorithm.sort.*;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;

/**
 * @Author Jason.Chen
 * @create 2023/9/26 13:51
 */
public class Test {

    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {

        int count=0;
        for(String s: details){
            int a = Integer.parseInt(s.substring(11,13));
            if(a>60){
                count++;
            }
        }
        return count;
    }
}
