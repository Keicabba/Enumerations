package it.figuccia;

public class Start {
    public static void main(String[] args) {
        enum Month {
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        }

        for (Month month : Month.values()) {
            if (month.name().endsWith("y")) {
                System.out.println(month.name() + " ends with y");
            } else {
                System.out.println(month.name() + " doesn't end with y");
            }
        }
    }
}