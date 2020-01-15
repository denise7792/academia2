package net.bit;

public class Main {

    public static void main(String[] args) {
        Docente[] lista_docenti = new Docente[5];
        EdizioneCorso ed = new EdizioneCorso();
        for (int i = 0; i < 5; i++) {
            double r = Math.random();
            if (r <= 0.5) {
                lista_docenti[i] = new Interno();
            } else {
                lista_docenti[i] = new Esterno();
            }
            System.out.println(ed.costoOrario(lista_docenti[i],i));
        }
    }
}
