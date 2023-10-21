package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {

        /*m = m ^ n;
        n = m ^ n;
        m = m ^ n;*/
        second = second ^ first;
        first = second ^ first;
        second = second ^ first;
        System.out.println(first+second);
    }

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseValuesSwap =new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(3,9);

    }
}
