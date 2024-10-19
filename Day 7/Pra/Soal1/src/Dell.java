class Dell extends Laptop implements LaptopFeatures {
    public Dell(String model, int ramSize, int storageSize) {
        super("Dell", model, ramSize, storageSize);
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
        System.out.println("Dell laptops come with Dell Cinema and advanced thermal cooling.");
    }
}
