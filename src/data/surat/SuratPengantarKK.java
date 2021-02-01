package data.surat;

public class SuratPengantarKK extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar KK";
        return namaSurat;
    }

}
