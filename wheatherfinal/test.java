package wheatherfinal;

public class test{
    public static void main(String[] args) {
     //   City sivas = new City("sivas","-14","-21","-4","0","-11",58);
     //   City konya = new City("konya","4","7","34","42","12",42);
        SorgularIMPL sorgularIMPL = new SorgularIMPL();
        sorgularIMPL.connection();
        /*sorgularIMPL.createTable5days();
        sorgularIMPL.add5days(konya);
        sorgularIMPL.add5days(sivas);*/
       // sorgularIMPL.days5id(1);
       // sorgularIMPL.days3id(2);
       // sorgularIMPL.days3name("konya");
        //sorgularIMPL.days5name("sivas");
        //sorgularIMPL.allCitys();
       // sorgularIMPL.deleteCityid(3);
        sorgularIMPL.allCitys();
        sorgularIMPL.updatebyid("pazartesi","-12",2);
        sorgularIMPL.allCitys();
        sorgularIMPL.close();
    }
}
