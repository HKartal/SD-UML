package Hoofdstuk4.huisdier;

public class Kat extends Huisdier {
    public Kat(String naam) {
        super(naam);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Miauw ik ben kat");
    }


    public void spin() {
        System.out.println("prrrr");
    }

}
