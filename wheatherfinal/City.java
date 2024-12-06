package wheatherfinal;

public class City {
    private String cityName;
    private String pazartesi;
    private String sali;
    private String carsamba;
    private String persembe;
    private String cuma;
    private int plaka;

    public City() {
    }

    public City(String cityName, String pazartesi, String sali, String carsamba, String persembe, String cuma, int plaka) {
        this.cityName = cityName;
        this.pazartesi = pazartesi;
        this.sali = sali;
        this.carsamba = carsamba;
        this.persembe = persembe;
        this.cuma = cuma;
        this.plaka = plaka;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPazartesi() {
        return pazartesi;
    }

    public void setPazartesi(String pazartesi) {
        this.pazartesi = pazartesi;
    }

    public String getSali() {
        return sali;
    }

    public void setSali(String sali) {
        this.sali = sali;
    }

    public String getCarsamba() {
        return carsamba;
    }

    public void setCarsamba(String carsamba) {
        this.carsamba = carsamba;
    }

    public String getPersembe() {
        return persembe;
    }

    public void setPersembe(String persembe) {
        this.persembe = persembe;
    }

    public String getCuma() {
        return cuma;
    }

    public void setCuma(String cuma) {
        this.cuma = cuma;
    }

    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return STR."City{cityName='\{cityName}', pazartesi='\{pazartesi}', sali='\{sali}', carsamba='\{carsamba}', persembe='\{persembe}', cuma='\{cuma}', plaka=\{plaka}}";
    }
}
