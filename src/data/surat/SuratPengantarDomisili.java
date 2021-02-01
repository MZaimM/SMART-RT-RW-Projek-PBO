package data.surat;

public class SuratPengantarDomisili extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Domisili";
        return namaSurat;
    }

}
