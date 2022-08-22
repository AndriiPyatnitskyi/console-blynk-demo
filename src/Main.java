public class Main {
    // init data from invertor that we consume
    static float invPower = 29.9f;
    static float invI = 9.7f;
    static float invU = 625.0f;
    static boolean invActive;

    public static void main(String[] args) {
        switchInvStatus(true);
        System.out.println("isActive: " + invActive);
        printInvData();
    }

    private static void printInvData() {
        if (invActive) {
            System.out.println("power: " + invPower);
            System.out.println("i: " + invI);
            System.out.println("u: " + invU);
        }
    }

    public static void switchInvStatus(boolean switchStatus) {
        invActive = switchStatus;
    }
}