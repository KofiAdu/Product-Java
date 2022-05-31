public abstract class  ProductBase {
    private String productName;
    private String serialNumber;

    public ProductBase(String productName, String serialNumber) {
        this.productName = productName;
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


}
