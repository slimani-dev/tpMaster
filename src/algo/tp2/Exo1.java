package algo.tp2;

public class Exo1 {

    public static void main(String[] args) {
        double a = 1;
        long n = 20000000000l;


        long startTime = System.currentTimeMillis();
        System.out.println("firs Method :" +  aToPowerOfN(a,n));
        long stopTime = System.currentTimeMillis();
        System.out.println("time of execution is: " + (stopTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println("second Method" +aToPowerOfN2(a,n));
        stopTime = System.currentTimeMillis();
        System.out.println("time of execution is: " + (stopTime - startTime));
    }

    private static double aToPowerOfN(double a,long n){
        double powerOfA = a;
        long i = 1; //calcuation of the barometrique number
        for (i = 1; i < n; i++) {
            powerOfA = powerOfA * a;
        }
        System.out.println("number of barometrique operations is : " + i);
        return  powerOfA;
    }

    private static double aToPowerOfN2(double a,long n){
        double powerOfA = aToPowerOfN(a,n/2);
            if(n % 2 == 0){
                powerOfA = powerOfA * powerOfA;
            }else {
                powerOfA = powerOfA * powerOfA * a;
            }

        return  powerOfA;
    }


}
