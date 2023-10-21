package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        int result = divider/divider;
        if (result*divider ==dividend){
            System.out.println("can be divided completely");
        }else
            System.out.println("cannot be divided completely");
    }

    public static void main(String[] args) {
        IntegerDivider integerDivider = new IntegerDivider();
        integerDivider.printCompletelyDivided(3,7);
    }
}
