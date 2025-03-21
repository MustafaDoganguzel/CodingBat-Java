package warmup1;

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.

//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8
public class SumDouble {
    public int sumDouble(int a, int b) {
        if(a == b ){
            return (a+b)*2;
        } else {
            return a+b;
        }
    }

    public static void main(String[] args) {
        SumDouble i = new SumDouble();
        System.out.println(i.sumDouble(1,2));
        System.out.println(i.sumDouble(3,2));
        System.out.println(i.sumDouble(2,2));

    }
}
