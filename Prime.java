import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        int start = 3; 
        int end = 1000000;

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);



        for (int i = start; i <= end; i += 2) {

            boolean p = true;

            for(int x : primes) {

                if (x <= Math.sqrt(i) + 1) {

                    if(i % x == 0) {
                        p = false;
                    } 

                } else {
                    break;
                }
            }
        

            if(p) {
                primes.add(i);
            }

        }

        System.out.println(primes);
        System.out.println(primes.size());
    }
}

