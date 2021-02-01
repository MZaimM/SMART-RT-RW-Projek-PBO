package database;

import model.Domisili;
import model.User;
import model.surat.SuratPengantar;

public class SmartDatabase implements SmartDao {

    @Override
    public String insertDashboard(SuratPengantar data) {
        String query = "insert into dashboard(status, link_surat) values "
                    + "('" + data.getStatus() + "','" + data.getLinkSurat() + "')";
        return query;
    }

    @Override
    public String insertDataWarga(User data) {
        String query = "insert into warga values ('"
                    + data.getNik() + "','" + data.getNama() + "','"
                    + Integer.parseInt(data.getKodePos()) + "','"
                    + data.getNoKK() + "','" + data.getTempatLahir()
                    + "','" + data.getTanggalLahir()
                    + "','" + data.getJenisKelamin() + "','" + data.getAgama()
                    + "','" + data.getPekerjaan() + "','" + data.getPendidikan()
                    + "','" + data.getStatusKawin() + "','" + data.getWargaNegara()
                    + "','" + data.getUsername() + "','" + data.getPassword()
                    + "','" + data.getOption() + "');";
        return query;
    }

    @Override
    public String insertDataDomisili(Domisili data) {
        String query = "insert into domisili values ('"
                    + Integer.parseInt(data.getKodeDomisili()) + "','"
                    + data.getProvinsi() + "','" + data.getKota() + "','"
                    + data.getKecamatan() + "','" + data.getKelurahan() + "','"
                    + Integer.parseInt(data.getRt()) + "','"
                    + Integer.parseInt(data.getRw()) + "','"
                    + data.getAlamat() + "');";
        return query;
    }

    @Override
    public String insertJenisSurat(String namaSurat) {
        String query = "insert into jenis_surat(nama_surat) values "
                    + "('" + namaSurat + "')";
        return query;
    }

    @Override
    public String insertSuratPengantar(SuratPengantar data) {
        String query = "insert into surat_pengantar"
                    + "(Tanggal_surat, keperluan, NIK, no_jenis_surat, no_dashboard) values "
                    + "('" + data.getTanggalSurat() + "','" + data.getKeperluan()
                    + "','" + data.getNik() + "',(select max(no_jenis_surat) from jenis_surat),"
                    + "(select max(no_dashboard) from dashboard));";
        return query;
    }

    @Override
    public String updateLink(String link) {
        String query = "update dashboard "
                    + "set link_surat = '" + link + "' where link_surat = '-' "
                    + "and no_dashboard = (select no_dashboard from surat_pengantar "
                    + "where nik=? and keperluan=?)";
        return query;
    }

    @Override
    public String updateStatus(String status) {
        String query = "update dashboard "
                    + "set status = '" + status + "' where status = 'Masih diproses' "
                    + "and no_dashboard = (select no_dashboard from surat_pengantar "
                    + "where nik=? and keperluan =?)";
        return query;
    }

    @Override
    public String queryAllDataWarga() {
        String query = "select*from warga ORDER BY nama ";
        return query;
    }

    @Override
    public String queryAllSuratPengantarWarga() {
        String query = "select nama_surat, nama,w.nik, tanggal_surat, keperluan, link_surat,status from surat_pengantar s "
                    + "join jenis_surat j on s.no_jenis_surat = j.no_jenis_surat "
                    + "join dashboard d on s.no_dashboard = d.no_dashboard "
                    + "join warga w on s.nik = w.nik ORDER BY d.status DESC";
        return query;
    }

    @Override
    public String queryAdmin() {
        String query = "select*from warga "
                    + "where "
                    + "username=? "
                    + "and "
                    + "password=?";
        return query;
    }

    @Override
    public String queryProfile() {
        String query = "select*from warga,domisili "
                    + "where warga.Kd_domisili = domisili.Kd_domisili "
                    + "and password =?";
        return query;
    }

    @Override
    public String queryByName() {
        String query = "select*from warga where Nama=?";
        return query;
    }

    @Override
    public String queryAllSuratPengantarUser() {
        String query = "select nama_surat, status, link_surat from surat_pengantar s "
                    + "join jenis_surat j on s.no_jenis_surat = j.no_jenis_surat "
                    + "join dashboard d on s.no_dashboard = d.no_dashboard "
                    + "join warga w on s.nik = w.nik where w.password =?";
        return query;
    }

    @Override
    public String queryByNameDashboardAdmin() {
        String query = "select nama_surat, nama,w.nik, tanggal_surat, keperluan, link_surat,status from surat_pengantar s "
                    + "join jenis_surat j on s.no_jenis_surat = j.no_jenis_surat "
                    + "join dashboard d on s.no_dashboard = d.no_dashboard "
                    + "join warga w on s.nik = w.nik where w.nama =? ";
        return query;
    }

    @Override
    public String deleteWarga() {
        String query = "Delete from warga where nik=? and Kd_domisili=?";
        return query;
    }

    @Override
    public String queryNotif(String st, String link) {
        String query = "select showNotif('" + st + "','" + link + "') as count";
        return query;
    }
}
