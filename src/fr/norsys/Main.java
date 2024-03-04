package fr.norsys;

public class Main {

    public static void main(String[] args) {

        int agr1 = 22;
        int agr2 = 7;
        System.out.println(getModulo(agr1, agr2));
    }

    /**
     * Methode qui retourne le modulo de deux nombres
     */
    private static int getModulo(int agr1, int agr2) {
        return agr1 / agr2;
    }

}
