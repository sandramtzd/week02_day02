public class Rectangle {

//  PROPERTIES
    private int length;
    private int width;



// CONSTRUCTOR
    public Rectangle (int length, int width){
        this.length =length;
        this.width = width;

    }

//    METHODS
    public int calculateArea (){

        return this.length * this.width;
    }

    public boolean checkifSquare (){
        return this.length== this.width;


    }


}




