package fr.norsys;

public class Main {

    public static void main(String[] args) {

        int arg1 = 22;
        int arg2 = 7;
        System.out.println(getModulo(arg1, arg2));
        System.out.println(getMultiply(arg1, arg2));
    }

    /**
     * Methode qui retourne le modulo de deux nombres
     */
    private static int getModulo(int arg1, int arg2) {
        return arg1 % arg2;
    }

    private static int getMultiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

}
