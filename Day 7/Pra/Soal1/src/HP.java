class HP extends Laptop implements LaptopFeatures {
    public HP(String model, int ramSize, int storageSize) {
        super("HP", model, ramSize, storageSize);
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
        System.out.println("HP laptops are known for their Bang & Olufsen audio system.");
    }
}
