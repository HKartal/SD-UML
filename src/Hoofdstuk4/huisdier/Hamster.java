package Hoofdstuk4.huisdier;

public class Hamster extends Huisdier implements Graver {
    public Hamster(String naam) {
        super(naam);
    }

    @Override
    public void graaf() {
        System.out.println("Duwt wat zaagsel aan de kant");
    }

    @Override
    public void maakGeluid() {
        System.out.println("piep ik ben hamster");
    }
}
