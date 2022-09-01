public class Main {
    // init data from invertor that we consume


    public static void main(String[] args) {
        Invertor invertor = new Invertor();

        switchInvertorStatus(true, invertor);

        System.out.println("isActive: " + invertor.invActive);

        printInvertorData(invertor);
    }

    private static void printInvertorData(Invertor invertor) {
        if (invertor.invActive) {
            System.out.println("power: " + invertor.invPower);
            System.out.println("i: " + invertor.invI);
            System.out.println("u: " + invertor.invU);
        }
    }

    public static void switchInvertorStatus(boolean switchStatus, Invertor invertor) {
        invertor.invActive = switchStatus;
    }
}