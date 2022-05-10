public class Product {
    private String name;
    private double cost;
    private double quantity;

    public Product(String productName, double productCost, double productQuantity) {
        this.name = productName;
        this.cost = productCost;
        this.quantity = productQuantity;
    }
    public void totalCost() {
        if (quantity > 1) {
            double finalCost = this.cost * this.quantity;
            System.out.println("The total cost of the "+this.name+" products together is $"+finalCost);
        }
        else {
            System.out.println("The total cost of one "+this.name+" product is $"+this.cost);
        }
    }
    public void printProduct() {
        System.out.println("The total sales of "+this.name+" products is "+quantity+" units. The cost of each was $"+cost);
    }
}
