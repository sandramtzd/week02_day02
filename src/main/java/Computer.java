public class Computer {

//    PROPERTIES
    private int storageSpace;
    private String printerModel;

    private boolean printerConnected;

//    CONSTRUCTOR

    public Computer (int storageSpace, String printerModel){
        this.storageSpace=storageSpace;
        this.printerModel=printerModel;
        this.printerConnected = false;

    }

    public int getStorageSpace() {
        return this.storageSpace;
    }

    void printerConnected()



    public String printMessage (String isConnected){
        return "Your printer is connected " + isConnected + this.printerConnected;
    }


}
