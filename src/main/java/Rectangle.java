public class Rectangle {

//  PROPERTIES
    private int lenght;
    private int width;



// CONSTRUCTOR
    public Rectangle (int lenght, int width){
        this.lenght =lenght;
        this.width = width;

    }

//    METHODS
    public int calculateArea (){
        return lenght*width;
    }

    public boolean checkifSquare (){
        return lenght==width;


    }


}




