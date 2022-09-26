public class Prime {
    public static void main(String[] args) {
        int m =6;
        boolean isPrime=true;
        for (int i=2;i<m;i++){
            int z=m%i;
            if (z==0) {
//                System.out.println("Not a prime");
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }


        }

}

