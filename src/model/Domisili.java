package model;

public class Domisili {

    private String kodeDomisili,
                kota,
                provinsi,
                kecamatan,
                alamat,
                kelurahan,
                rt, rw;

    public Domisili(String kodeDomisili, String kota, String provinsi, String kecamatan, String alamat, String kelurahan, String rt, String rw) {
        this.kodeDomisili = kodeDomisili;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kecamatan = kecamatan;
        this.alamat = alamat;
        this.kelurahan = kelurahan;
        this.rt = rt;
        this.rw = rw;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public Domisili() {

    }

    public String getKodeDomisili() {
        return kodeDomisili;
    }

    public void setKodeDomisili(String kodeDomisili) {
        this.kodeDomisili = kodeDomisili;
    }
}
