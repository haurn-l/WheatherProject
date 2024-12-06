package wheatherfinal;

import java.sql.SQLException;

public interface Sorgular {
    public void connection();
    public void createTable5days();
    public void add5days(City city);
    public void allCitys();
    public void days3id(int arananid);
    public void days5id(int arananid);
    public void days3name(String arananSehir);
    public void days5name(String arananSehir);
    public void updatebyid(String gun,String yeniSicaklik,int sehirid);
    public void deleteCityid(int deleteid);
    public void close();
}
