package warmup1;

//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//
//
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false
public class NearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundred(93));
        System.out.println(obj.nearHundred(210));
        System.out.println(obj.nearHundred(-101));
        System.out.println(obj.nearHundred(89));

    }
}
