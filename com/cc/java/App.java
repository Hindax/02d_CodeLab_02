package com.cc.java;

public class App {

    public static void main(String[] args) {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Cartmann", "Eric",
                "Chef", 2010);

        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Broflovski", "Kyle",
                "Java developper", 2011);

        Mitarbeiter mitarbeiter3 = new Mitarbeiter("March", "Stan",
                "Team leader", 2012);

        Mitarbeiter[] people = new Mitarbeiter[] { mitarbeiter1, mitarbeiter2, mitarbeiter3 };

        int i = 1;
        for (Mitarbeiter mitarbeiter : people) {

            output("Mitarbeiter" + i + ":\n\tName: " + mitarbeiter.getInfo("#familyName")
                    + " " + mitarbeiter.getInfo("#firstName")
                    + "\n\tRole: " + mitarbeiter.getInfo("#role")
                    + "\n\tYear of entry: " + mitarbeiter.getInfo("#yearOfEntry")
                    + "\n");

            i++;

        }

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
