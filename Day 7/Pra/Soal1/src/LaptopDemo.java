public class LaptopDemo {
    //4.53
    public static void main(String[] args) {
        Dell dellLaptop = new Dell("XPS 13", 16, 512);
        HP hpLaptop = new HP("Spectre x360", 8, 256);
        Asus asusLaptop = new Asus("ZenBook Pro", 16, 1024);

  
        dellLaptop.powerOn();
        dellLaptop.showSpecs();
        dellLaptop.uniqueFeature();
        dellLaptop.powerOff();

        System.out.println();


        hpLaptop.powerOn();
        hpLaptop.showSpecs();
        hpLaptop.uniqueFeature();
        hpLaptop.powerOn();

        System.out.println();


        asusLaptop.powerOn();
        asusLaptop.showSpecs();
        asusLaptop.uniqueFeature();
        asusLaptop.powerOff();
    }
}
