public class Computer {

//    PROPERTIES
    private int storage;
    private String printer;

    private boolean printerConnected;

//    CONSTRUCTOR

//    public Computer (int storage, String printer){
//        this.storage=storage;
//        this.printer=printer;
//        this.printerConnected = false;
//
//    }

    public Computer (int storage){
        this.storage = storage;
        this.printer = null;
    }


    public int getStorage() {
        return this.storage;
    }

//    public void  addStorage(int updatedStorage){
//        this.storage = storage + updatedStorage;
//    }

    public void addStorage(int additionalStorage){
        this.storage += additionalStorage;
    }

    public String getPrinter(){
        return this.printer;
    }

    public void setPrinter(String updatedPrinter){
        this.printer = updatedPrinter;

    }



    public void printMessage (String message){
        if (printer != null){
            System.out.println(message);
        }

    }






}
