class Asus extends Laptop implements LaptopFeatures {
    public Asus(String model, int ramSize, int storageSize) {
        super("Asus", model, ramSize, storageSize);
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " " + model + " is powering on.");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " " + model + " is powering off.");
    }

    @Override
    public void uniqueFeature() {
        System.out.println("Asus laptops feature the ScreenPad, a secondary touch display.");
    }
}
