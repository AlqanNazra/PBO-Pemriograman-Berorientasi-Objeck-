class Laptop {
    String brand;
    String model;
    int ramSize;
    int storageSize;

    public Laptop(String brand, String model, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramSize + "GB");
        System.out.println("Storage: " + storageSize + "GB");
    }
}
