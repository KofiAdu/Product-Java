public class Product extends ProductBase {
    private String description;
    private double price;
    private boolean inStorage;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isInStorage() {
        return inStorage;
    }
    public void setInStorage(boolean inStorage) {
        this.inStorage = inStorage;
    }
    public  Product(String name, String serialNumber, String description, double price, boolean inStorage){
        super(name, serialNumber);
        this.description = description ;
        this.price = price ;
        this.inStorage = inStorage ;
    }

    public  void printProductData(){
        System.out.println("name: "+this.getProductName()+ "Serial Number: "+this.getSerialNumber()+ "Description: "+getDescription()+"Price: "+getPrice()+" In-Storage: "+this.inStorage);
    }
}
