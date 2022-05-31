import java.util.ArrayList ;

public class Canon  implements  ProductInterface{


    private ArrayList<Product> product;
    public ArrayList<Product> getProducts() {
        return product;
    }


    public Canon(){
        product = new ArrayList<>();
        addProduct(new Product("c1 ","1 "," 4k camera ", 10, true ));
        addProduct(new Product("c2 ","2 "," 8k camera", 30, true ));
        addProduct(new Product("c3 ","3 "," 16k camera", 90, false ));


    }
    public ArrayList<Product> getProductInformation(){
        return product;
    }

    public void addProduct(Product p){
        this.product.add(p);
    }
}
