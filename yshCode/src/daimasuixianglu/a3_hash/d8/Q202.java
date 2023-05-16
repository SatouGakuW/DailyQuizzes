package daimasuixianglu.a3_hash.d8;

import java.util.HashSet;
import java.util.Set;

public class Q202 {

    public boolean isHappy(int n) {

        Set<Integer> record = new HashSet<>();
        if(n == 1)
            return true;
        while(n != 1){
            if(record.contains(n))
                return false;
            record.add(n);
            n = multi(n);
        }
        return true;

    }

    public int multi(int n){
        int sum  = 0;
        while(n != 0){
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }

}
