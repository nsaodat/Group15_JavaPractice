public class ItemObject {

    public static void main(String[] args) {


        Item item = new Item("Apple", 2.3, 20);

        System.out.println( item.calcCost()); // 46.0
        System.out.println(item); // Item{name='Apple', unitPrice=2.3, quantity= $20, total price= $20}
    }
    }

