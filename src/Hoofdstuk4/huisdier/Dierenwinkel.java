package Hoofdstuk4.huisdier;

import Hoofdstuk4.huisdier.Huisdier;

import java.util.ArrayList;

public class Dierenwinkel {

    private ArrayList<Huisdier> lijst;

    public Dierenwinkel() {
        lijst = new ArrayList<Huisdier>();
    }

    public void voegToe(Huisdier dier) {
        lijst.add(dier);
    }

    public void printOverzicht () {
        for (Huisdier dier : lijst) {
            System.out.println(dier.getNaam());
            dier.maakGeluid();
            System.out.println();
        }
    }
}
