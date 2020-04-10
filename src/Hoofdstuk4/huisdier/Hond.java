package Hoofdstuk4.huisdier;

public class Hond extends Huisdier implements Graver {
    public Hond(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("lmao ik ben hond waf waf");
    }

    public void kwispel() {
        System.out.println("*kwispel* zoef zoef");
    }

    @Override
    public void graaf() {
        System.out.println("*boze blik naar hond terwijl hij in mijn nieuwgelegde grasmat zit te graven*");
    }
}
