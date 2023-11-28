import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {


        List<String> l= new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if ((i) % 3 == 0 && (i)%15!=0 ){
                l.add("Fizz");
            } else if ((i)%5==0 && (i)%15!=0) {
                l.add("Buzz");
            } else if ((i)%15==0){
                l.add("FizzBuzz");
            } else {
                l.add(String.valueOf(i));
            }
        }
        return l;
    }
}