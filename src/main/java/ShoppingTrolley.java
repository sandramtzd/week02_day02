import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> items = new ArrayList<>();

    public ShoppingTrolley (ArrayList<String> items) {


    }

    public void addItem(String newItem){
        items.add("Milk");
    }

    public int countItemsInTrolley(){
        return items.size();

    }

    public boolean checkIfItemInTrolley(){

        for (String item : items){
            if(item != null){


            }
        }



    }

}
