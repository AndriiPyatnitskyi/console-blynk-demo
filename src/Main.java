public class Main {
    public static void main(String[] args) {
        Invertor artynsk = new Invertor();
        artynsk.active = true;
        artynsk.power = 30f;
        artynsk.i = 5f;
        artynsk.u = 10f;

        switchInvertorStatus(true, artynsk);
        System.out.println("isActive: " + artynsk.active);
        printInvertorData(artynsk);

        //
        System.out.println("------------------");
        //

        Invertor zelena = new Invertor();
        zelena.active = true;
        zelena.power = 40f;
        zelena.i = 10f;
        zelena.u = 10f;

        switchInvertorStatus(false, zelena);
        System.out.println("isActive: " + zelena.active);
        printInvertorData(zelena);
    }

    private static void printInvertorData(Invertor invertor) {
        if (invertor.active) {
            System.out.println("power: " + invertor.power);
            System.out.println("i: " + invertor.i);
            System.out.println("u: " + invertor.u);
        }
    }

    public static void switchInvertorStatus(boolean switchStatus, Invertor invertor) {
        invertor.active = switchStatus;
    }
}