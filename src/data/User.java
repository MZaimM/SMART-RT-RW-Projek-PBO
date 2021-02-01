package data;

public class User {
    private String
                nik,
                nama,
                noKK,
                tempatLahir,
                tanggalLahir,
                jenisKelamin,
                agama,
                kodePos,
                pekerjaan,
                pendidikan,
                statusKawin,
                wargaNegara,
                username,
                password,
                option;

    public User(String nik, String nama, String noKK, String tempatLahir, String tanggalLahir, String jenisKelamin, String agama, String kodePos, String pekerjaan, String pendidikan, String statusKawin, String wargaNegara, String username, String password, String option) {
        this.nik = nik;
        this.nama = nama;
        this.noKK = noKK;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.kodePos = kodePos;
        this.pekerjaan = pekerjaan;
        this.pendidikan = pendidikan;
        this.statusKawin = statusKawin;
        this.wargaNegara = wargaNegara;
        this.username = username;
        this.password = password;
        this.option = option;
    }
    
    public User(){
        
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoKK() {
        return noKK;
    }

    public void setNoKK(String noKK) {
        this.noKK = noKK;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getStatusKawin() {
        return statusKawin;
    }

    public void setStatusKawin(String statusKawin) {
        this.statusKawin = statusKawin;
    }

    public String getWargaNegara() {
        return wargaNegara;
    }

    public void setWargaNegara(String wargaNegara) {
        this.wargaNegara = wargaNegara;
    }
                
}
