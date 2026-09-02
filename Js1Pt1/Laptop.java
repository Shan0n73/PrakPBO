
public class Laptop {

    private String processor;
    private int ramSize;
    private int storageSize;

    public void setProcessor(String cpu) {
        this.processor = cpu;
    }

    public void setRamSize(int ram) {
        this.ramSize = ram;
    }

    public void setStorageSize(int storage) {
        this.storageSize = storage;
    }

    public void cetakInformasi() {
        System.out.println("=== LAPTOP ===");
        System.out.println("Processor\t: " + processor);
        System.out.println("RAM\t\t: " + ramSize + " GB");
        System.out.println("Storage\t\t: " + storageSize + " GB");
        System.out.println();
    }
}
