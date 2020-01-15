package net.bit;

import java.util.List;

public class EdizioneCorso extends Corso {
    private int corso_id;
    protected Docente[] lista_docenti;

    public double costoOrario(Docente d, int ore)

    {
        return d.costoOrario() * ore;
    }
}
