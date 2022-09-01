public class Main {
    public static void main(String[] args) {
        Invertor artynsk = initInvertor(true, 30f, 5f, 10f);
        processInvertor(artynsk);
        Invertor zelena = initInvertor(true, 40f, 10f, 10f);
        processInvertor(zelena);
    }

    private static void processInvertor(Invertor invertor) {
        switchInvertorStatus(true, invertor);
        System.out.println("isActive: " + invertor.active);
        printInvertorData(invertor);
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