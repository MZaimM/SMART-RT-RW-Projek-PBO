package data.surat;

public class SuratPengantarMutasi extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Mutasi";
        return namaSurat;
    }

}
