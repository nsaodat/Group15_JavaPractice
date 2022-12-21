public class Test {

    public static void main(String[] args) {


        Item item = new Item("Apple", 2.3, 20);

        System.out.println( item.calcCost()); // 46.0
        System.out.println(item); // Item{name='Apple', unitPrice=2.3, quantity= 20, total price= $46.0}}

        item.setName("Melon");
        item.setUnitPrice(5);
        item.calcCost();
        item.setQuantity(20);
        System.out.println(item);

    }
    }

