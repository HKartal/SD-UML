package Hoofdstuk4.huisdier;

public class App {
    public static void main(String[] args) {
        Huisdier kat = new Kat("Minoes");
        Huisdier hond = new Hond("Kennie");
        Graver hondStout = new Hond("Fifi");
        hondStout.graaf();

        Huisdier dier = new Kat("Wodan");
        ((Kat) dier).spin();

        Dierenwinkel winkel = new Dierenwinkel();
        winkel.voegToe(kat);
        winkel.voegToe(hond);
        winkel.voegToe(new Kat("pepper"));

        winkel.printOverzicht();


    }
}
