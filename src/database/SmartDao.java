package database;


import model.Domisili;
import model.User;
import model.surat.SuratPengantar;

public interface SmartDao {
    
    public String insertDataWarga(User data);
    public String insertDataDomisili(Domisili data);
    public String insertSuratPengantar(SuratPengantar data);
    public String insertDashboard(SuratPengantar data);
    public String insertJenisSurat(String namaSurat);
    
    public String updateLink(String link);
    public String updateStatus(String status);
    
    public String deleteWarga();
    
    public String queryAllDataWarga();
    public String queryAllSuratPengantarWarga();
    public String queryAllSuratPengantarUser();
    public String queryByName();
    public String queryByNameDashboardAdmin();
    public String queryProfile();
    public String queryAdmin();
    public String queryNotif(String st, String link);
    
}
