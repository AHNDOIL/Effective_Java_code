package Item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BigDecimalTest {

    public static void main(String[] args){
        BigDecimal number1 = new BigDecimal("1.0");
        BigDecimal number2 = new BigDecimal("1.00");

        Set<BigDecimal> set1 = new HashSet<>(); //equals로 비교
        set1.add(number1);
        set1.add(number2);

        Set<BigDecimal> set2 = new TreeSet<>(); //compareTo로 비교
        set2.add(number1);
        set2.add(number2);

        System.out.println(set1.toString());
        System.out.println(set2.toString());
    }
}
