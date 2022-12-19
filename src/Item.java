public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() { // get method is generated
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank() || name == null){ //if name is empty OR blank OR equal to null
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        String specialChars = ""; //  to  get all special chars other than space

        for (char each : name.toCharArray()) { // created for each Loop
            if(!Character.isLetterOrDigit(each) && each != ' '){  // getting all special character except for space
                specialChars += each; // special char will increase

            }
        }
        // if name contains special characters other than space
        if(specialChars.length() > 0){
            System.err.println("Invalid Name: "+name);//
            System.exit(1);
        }

        // if name does not start with letter
        if(!Character.isLetter(name.charAt(0))){
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // set method is generated with condition:
    public void setQuantity(int quantity) {
        if(quantity <=0){ //   if quantity<= 0 means it is negative
            System.err.println("Invalid quantity: "+quantity); // print Invalid quantity
            System.exit(1);
        }

        if(name.equalsIgnoreCase("toilet paper")){  // if Item is " toilet paper" including with case - sensitivity
            this.quantity = 1;// quantity is equal to 1 only!
        }

        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() { // toString method generated for printing out
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity= " + quantity +
                ", total price= $" + calcCost() +
                '}';
    }


}




