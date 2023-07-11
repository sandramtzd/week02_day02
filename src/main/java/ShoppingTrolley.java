import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> items;
//    ArrayList<String> items = new ArrayList<>();


    public ShoppingTrolley () {
        items = new ArrayList<>();

    }

    public void addItem(String item){
        items.add(item);
    }

    public int countItemsInTrolley(){
        return items.size();

    }

    public boolean checkIfItemInTrolley(String itemName){
        return items.contains(itemName);



    }

//    I dont know how I reach this conclusion
    public ArrayList getItems (){
        return this.items;
    }

}
//Reference: https://stackoverflow.com/questions/26162017/how-to-design-the-classes-for-a-simple-shopping-cart-example-using-tdd-approach