import java.util.ArrayList ;

public class Genelec implements  ProductInterface {

    private ArrayList<Product> product ;
    public ArrayList<Product> getProduct() {
        return product;
    }
    public Genelec(){
        product = new ArrayList<>();
        addProduct(new Product("s1 ","0248IUI89 "," Surround-Sound ", 60, false));
        addProduct(new Product("s2 ","27877NN4 ","  Home-Theater ", 79, true ));
        addProduct(new Product("s3 ","31879JHG1 "," Headphones ", 34, true ));
    }
    public ArrayList<Product> getProductInformation(){
        return product ;
    }
    public void addProduct(Product p){
        product.add(p) ;
    }
}