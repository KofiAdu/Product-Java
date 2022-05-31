public class Main {
    public static void main(String[] args) {
        Canon  canon = new Canon();
        Genelec genelec = new Genelec();
        for( Product pro : canon.getProductInformation()){
            pro.printProductData();
        }
        System.out.println("\n");
        for( Product prod : genelec.getProductInformation()){
            prod.printProductData();
        }
    }
}
