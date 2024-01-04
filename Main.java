public class Main {
    public static void main(String[] args){
        System.out.println("StartUp:");
        User Startup = new User("UFeel", "Fahriddin");
        User Startup2 = new User();
//        Startup.set_name("UFeel");
//        Startup.set_membership("Fahriddin");
//        User Startup2 = new User();
//        Startup2.set_name("Eplant");
//        Startup2.set_membership("Fyodor");
//        User Startup3 = new User();
//        Startup3.set_name("XFire");
//        Startup3.set_membership("Akmal");
//        User Startup4 = new User();
//        Startup4.set_name("OyTickets");
//        Startup4.set_membership("Nurislom");
//        User Startup5 = new User();
//        Startup5.set_name("MedBook");
//        Startup5.set_membership("Karimakhon");
//        User Startup6 = new User();
//        Startup6.set_name("Flymart");
//        Startup6.set_membership("Alijon");
//        User Startup7 = new User();
//        Startup7.set_name("Speaklish");
//        Startup7.set_membership("Bobirjon");
//        User Startup8 = new User();
//        Startup8.set_name("Fashionista");
//        Startup8.set_membership("Nafisa");
//        User Startup9 = new User();
//        Startup9.set_name("Steppeup");
//        Startup9.set_membership("Alisher");
//        User Startup10 = new User();
//        Startup10.set_name("Biofuel");
//        Startup10.set_membership("Maxmud");
//        User Startup11 = new User();
//        Startup11.set_name("Rent Market");
//        Startup11.set_membership("Akmaljon");
//        User Startup12 = new User();
//        Startup12.set_name("Engline");
//        Startup12.set_membership("Shakhlo");
//        User Startup13 = new User();
//        Startup13.set_name("Activo");
//        Startup13.set_membership("Gulasal");
//        User Startup14 = new User();
//        Startup14.set_name("Rastik");
//        Startup14.set_membership("Shuxrat");

        Startup.set_membership(User.Type.TechBased);
//        Startup2.set_membership(User.Type.Green);
//        Startup3.set_membership(User.Type.TechBased);
//        Startup4.set_membership(User.Type.Market);
//        Startup5.set_membership(User.Type.Market);
//        Startup6.set_membership(User.Type.Market);
//        Startup7.set_membership(User.Type.TechBased);
//        Startup8.set_membership(User.Type.TechBased);
//        Startup9.set_membership(User.Type.Market);
//        Startup10.set_membership(User.Type.Green);
//        Startup11.set_membership(User.Type.Market);
//        Startup12.set_membership(User.Type.Market);
//        Startup13.set_membership(User.Type.TechBased);
//        Startup14.set_membership(User.Type.TechBased);

        System.out.println(Startup2.get_type());
        System.out.println(Startup2.get_name());
        System.out.println(Startup2.get_membership());
    }
}