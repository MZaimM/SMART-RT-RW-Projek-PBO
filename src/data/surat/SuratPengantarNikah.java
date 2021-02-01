package data.surat;

public class SuratPengantarNikah extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Nikah";
        return namaSurat;
    }

}
