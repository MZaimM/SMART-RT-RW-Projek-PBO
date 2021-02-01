package data.surat;

public class SuratPengantarKematian extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Kematian";
        return namaSurat;
    }

}
