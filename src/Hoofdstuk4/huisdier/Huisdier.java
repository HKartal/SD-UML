package Hoofdstuk4.huisdier;

public abstract class Huisdier {

    private String naam;

    public Huisdier(String naam) {
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    }

    public abstract void maakGeluid();
}
