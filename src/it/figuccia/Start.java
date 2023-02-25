package it.figuccia;

public class Start {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            char capitalLetter = month.name().charAt(0);
            String word = month.name().substring(1).toLowerCase();
            String month1 = capitalLetter + word;

            if (month1.endsWith("y")) {
                System.out.println(month1 + " ends with y");
            }
            else {System.out.println(month1 + " doesn't end with y");
            }
        }
    }
}
/* Bastava questo commentato sotto. Ma i mesi in maiuscolo mi davano fastidio e li ho rieditati.
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if (month.name().endsWith("Y")) {
                System.out.println(month.name() + " ends with y");
            } else {
                System.out.println(month.name() + " doesn't end with y");
            }
        }
    }
*/
