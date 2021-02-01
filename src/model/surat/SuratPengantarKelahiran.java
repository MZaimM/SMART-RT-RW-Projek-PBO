package model.surat;

public class SuratPengantarKelahiran extends SuratPengantar {

    @Override
    public String tampilNamaSurat() {
        super.namaSurat = "Surat Pengantar Kelahiran";
        return namaSurat;
    }

}
