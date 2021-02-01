package model.surat;

public class SuratPengantar {

    private String status;
    private String linkSurat;
    private String tanggalSurat, keperluan, nik, keterangan;
    protected String namaSurat;

    public SuratPengantar(String tanggalSurat, String keperluan, String nik) {
        this.tanggalSurat = tanggalSurat;
        this.keperluan = keperluan;
        this.nik = nik;
    }

    public SuratPengantar(String status, String linkSurat) {
        this.status = status;
        this.linkSurat = linkSurat;
    }

    public SuratPengantar() {
        
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getNamaSurat() {
        return namaSurat;
    }

    public void setNamaSurat(String namaSurat) {
        this.namaSurat = namaSurat;
    }

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLinkSurat() {
        return linkSurat;
    }

    public void setLinkSurat(String linkSurat) {
        this.linkSurat = linkSurat;
    }

    public String tampilNamaSurat() {
        return namaSurat;
    }

}
