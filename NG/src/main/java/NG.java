import staff.Cookie;
import staff.SpiceCake;
import staff.Staff;
import staff.Sweet;

public class NG {
    public static void main(String[] args) {
        Sweet sweet1=new Sweet("Стэп",3.00,10.00,"Сластена");
        Sweet sweet2=new Sweet("Аленка",2.00,7.00,"Красный октябрь" );
        Sweet sweet3=new Sweet("Белочка",3.00,8.00,"Бабаевский");
        Sweet sweet4=new Sweet();
        sweet4.setBrand("KandyKandy");
        sweet4.setName("fantasy");
        sweet4.setPrice(50.00);
        sweet4.setWeight(20.00);
        Cookie cookie1=new Cookie ( "Овсяное",10.00,15.00,"L");
        Cookie cookie2=new Cookie("Миндальное",15.00,30.00,"M");
        Cookie cookie3=new Cookie("Имбирное",7.00,10.00,"S");
        SpiceCake spiceCake1=new SpiceCake("Имбирный с глазурью",50.00,100.00,"овал");
        SpiceCake spiceCake2= new SpiceCake("Имбирный обычный",40.00,70.00,"квадратный");
        SpiceCake spiceCake3=new SpiceCake("Тульский пряник",200.00,2000.0,"прямоукольный");
        System.out.println("Новогодний подарок состоиз из:");
        Staff [] sack={sweet1,sweet2,sweet3,sweet4,cookie1,cookie2,cookie3,spiceCake1,spiceCake2,spiceCake3};

        Double Ves = 0.00 ;
        for (int i  = 0; i < sack.length; i++){
            Ves+=sack[i].getWeight() ;


        }System.out.println("Вес подарка"+Ves);
        Double U = 0.00 ;
        for (int i  = 0; i < sack.length; i++){
            U+=sack[i].getPrice() ;


        }System.out.println("Цена подарка"+U);
        for (Staff someStaff:sack) {
           System.out.println(someStaff.toString()) ;


        }
    }
}