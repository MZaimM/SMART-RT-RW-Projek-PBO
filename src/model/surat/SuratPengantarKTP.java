package model.surat;

public class SuratPengantarKTP extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar KTP";
        return namaSurat;
    }

}
