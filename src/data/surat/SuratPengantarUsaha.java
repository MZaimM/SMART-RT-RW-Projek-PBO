package data.surat;

public class SuratPengantarUsaha extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Usaha";
        return namaSurat;
    }

}
