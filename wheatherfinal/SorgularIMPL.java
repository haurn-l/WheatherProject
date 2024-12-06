package wheatherfinal;

import java.sql.*;

public class SorgularIMPL implements Sorgular{
    static Connection connection = null;
    static PreparedStatement pStatement =null;
    static ResultSet resultSet = null;

    @Override
    public void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Bağlanılıyor...");
        } catch (ClassNotFoundException e) {
            System.err.println("Drivera bağlanılamadı."+e.getMessage());
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/wheather","root","2024123011Qk!");
            System.out.println("Connection bağlantısı başarılı");
        } catch (SQLException e) {
            System.out.println("Connection bağlantısı yapılamadı.Hata : "+e.getMessage());
        }
    }
    @Override
    public void createTable5days() {
        String tabloOlustur = "CREATE TABLE 5gunluk (id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,cityName VARCHAR(15), pazartesi VARCHAR(15),sali VARCHAR(15),carsamba VARCHAR(15),persembe VARCHAR(15),cuma VARCHAR(15),plaka INT)";
        try {
            pStatement = connection.prepareStatement(tabloOlustur);
            pStatement.execute();
            System.out.println("5gunluk havadurumu tablosu basarıyla olusturuldu");
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void add5days(City city) {
        String eklemeSorugusu = "INSERT INTO 5gunluk(cityName,pazartesi,sali,carsamba,persembe,cuma,plaka)VALUES(?,?,?,?,?,?,?)";
        try {
            pStatement=connection.prepareStatement(eklemeSorugusu);
            pStatement.setString(1,city.getCityName());
            pStatement.setString(2,city.getPazartesi());
            pStatement.setString(3,city.getSali());
            pStatement.setString(4,city.getCarsamba());
            pStatement.setString(5,city.getPersembe());
            pStatement.setString(6,city.getCuma());
            pStatement.setInt(7,city.getPlaka());
            pStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ekleme sırasında hata olustu. HATA : "+e.getMessage());
        }
    }
    @Override
    public void allCitys() {
        String sorgu = "SELECT * FROM 5gunluk";
        try {
            pStatement = connection.prepareStatement(sorgu);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()){//resulset.next boolean türünde veri döndürür bu yüzden
                // while içi false olduğunda veri çekmeyi bitirir.
                int id = resultSet.getInt("id");
                String cityName = resultSet.getNString("cityName");
                String pazartesi = resultSet.getNString("pazartesi");
                String sali = resultSet.getString("sali");
                String carsamba = resultSet.getString("carsamba");
                String persembe = resultSet.getString("persembe");
                String cuma = resultSet.getString("cuma");
                int plaka = resultSet.getInt("plaka");
                System.out.println("id : "+id+", cityName : "+cityName+", pazartesi : "+pazartesi+", sali : "+sali+", carsamba : "+carsamba+", persembe : "+persembe+", cuma : "+cuma+", plaka : "+plaka);
                System.out.println();
                System.out.println("***********");
            }
        } catch (SQLException e) {
            System.err.println("Hata : "+e.getMessage());
        }
    }
    @Override
    public void days3id(int arananid) {
        String sorgu = "SELECT * FROM 5gunluk WHERE id=?";
        try {
            pStatement = connection.prepareStatement(sorgu);
            pStatement.setInt(1,arananid);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String cityName = resultSet.getNString("cityName");
                String pzt = resultSet.getNString("pazartesi");
                String sali = resultSet.getNString("sali");
                String carsamba =resultSet.getNString("carsamba");
                int plaka = resultSet.getInt("plaka");
                System.out.println("id : "+id+", cityName : "+cityName+", pazartesi : "+pzt+", Sali : "+sali+", Carsamba : "+carsamba+", plaka : "+plaka);
            }
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void days5id(int arananid) {
        String sorgu = "SELECT * FROM 5gunluk WHERE id= ?";
        try {
            pStatement = connection.prepareStatement(sorgu);
            pStatement.setInt(1,arananid);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String cityName = resultSet.getNString("cityName");
                String pzt = resultSet.getNString("pazartesi");
                String sali = resultSet.getNString("sali");
                String carsamba =resultSet.getNString("carsamba");
                String persembe = resultSet.getNString("persembe");
                String cuma = resultSet.getNString("cuma");
                int plaka = resultSet.getInt("plaka");
                System.out.println("id : "+id+", cityName : "+cityName+", pazartesi : "+pzt+", Sali : "+sali+", Carsamba : "+carsamba+", persembe : "+persembe+", cuma : "+cuma+", plaka : "+plaka);
            }
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void days3name(String arananSehir) {
        String sorgu = "SELECT * FROM 5gunluk WHERE cityName=?";
        try {
            pStatement = connection.prepareStatement(sorgu);
            pStatement.setString(1,arananSehir);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String cityName = resultSet.getNString("cityName");
                String pzt = resultSet.getNString("pazartesi");
                String sali = resultSet.getNString("sali");
                String carsamba =resultSet.getNString("carsamba");
                int plaka = resultSet.getInt("plaka");
                System.out.println("id : "+id+", cityName : "+cityName+", pazartesi : "+pzt+", Sali : "+sali+", Carsamba : "+carsamba+", plaka : "+plaka);
            }
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void days5name(String arananSehir) {
        String sorgu = "SELECT * FROM 5gunluk WHERE cityName=?";
        try {
            pStatement = connection.prepareStatement(sorgu);
            pStatement.setString(1,arananSehir);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String cityName = resultSet.getNString("cityName");
                String pzt = resultSet.getNString("pazartesi");
                String sali = resultSet.getNString("sali");
                String carsamba =resultSet.getNString("carsamba");
                String persembe = resultSet.getNString("persembe");
                String cuma = resultSet.getNString("cuma");
                int plaka = resultSet.getInt("plaka");
                System.out.println("id : "+id+", cityName : "+cityName+", pazartesi : "+pzt+", Sali : "+sali+", Carsamba : "+carsamba+", persembe : "+persembe+", cuma : "+cuma+", plaka : "+plaka);
            }
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void deleteCityid(int deleteid) {
        String sorgu = "DELETE FROM 5gunluk WHERE id=?";
        try {
            pStatement=connection.prepareStatement(sorgu);
            pStatement.setInt(1,deleteid);
            pStatement.executeUpdate();
            System.out.println(deleteid+" idli sehir silindi.");
        } catch (SQLException e) {
            System.err.println("HATA : "+e.getMessage());
        }
    }
    @Override
    public void updatebyid(String gun,String yeniSicaklik,int sehirid) {
        String eklemeSorugusu = "UPDATE 5gunluk SET "+gun+"= ? WHERE id = ?";
        try {
            pStatement=connection.prepareStatement(eklemeSorugusu);
            pStatement.setString(1,yeniSicaklik);
            pStatement.setInt(2,sehirid);
            pStatement.executeUpdate();
            System.out.println("guncelleme basarili");
        } catch (SQLException e) {
            System.err.println("guncelleme sirasinda hata olustu. HATA : "+e.getMessage());
        }
    }
    @Override
    public void close() {
        if (pStatement!=null){
        try {
            pStatement.close();
            System.out.println("pStatment basarılı bir sekilde kapatıldı");
        } catch (SQLException e) {
            System.err.println("pStatement kapatılırken bir sorun olustu");
            System.out.println(e.getMessage());
        }
    }
        if (connection!=null){
            try {
                connection.close();
                System.out.println("Connection basarılı bir sekilde kapatıldı.");
            } catch (SQLException e) {
                System.err.println("Connection kapatılırken hata olusutu.Hata : "+e.getMessage());
            }
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.err.println("resultSet kapatılırken bir hata oluştu. HATA : "+e.getMessage());
            }
        }
    }
}
