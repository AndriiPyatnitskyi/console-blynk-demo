public class Main {
    public static void main(String[] args) {
        Invertor artynsk = initInvertor(true, 30f, 5f, 10f);
        switchInvertorStatus(true, artynsk);
        System.out.println("isActive: " + artynsk.active);
        printInvertorData(artynsk);

        //
        System.out.println("------------------");
        //

        Invertor zelena = initInvertor(true, 40f, 10f, 10f);
        switchInvertorStatus(true, zelena);
        System.out.println("isActive: " + zelena.active);
        printInvertorData(zelena);
    }

    private static Invertor initInvertor(boolean active, float power, float i, float u) {
        Invertor invertor = new Invertor();
        invertor.active = active;
        invertor.power = power;
        invertor.i = i;
        invertor.u = u;
        return invertor;
    }

    private static void printInvertorData(Invertor invertor) {
        if (invertor.active) {
            System.out.println("power: " + invertor.power);
            System.out.println("i: " + invertor.i);
            System.out.println("u: " + invertor.u);
        }
    }

    private static void switchInvertorStatus(boolean switchStatus, Invertor invertor) {
        invertor.active = switchStatus;
    }
}