public class Product implements  SalesLine{

    //Atributos
    private String code;
    private String name;
    private String brand;
    private String model;
    private Float price;
    private Integer vatRate;

    //Metodos
    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    @Override
    public String getCode() {return code;}
    @Override
    public void setCode(String code) {this.code = code;}

    @Override
    public String getName() {return name;}

    @Override
    public void setName(String name) {this.name = name;}

    @Override
    public Float getPrice() {return price;}

    @Override
    public void setPrice(Float price) {this.price = price;}

    @Override
    public Integer getVatRate() {return vatRate;}
    @Override
    public void setVatRate(Integer vatRate) {this.vatRate = vatRate;}

}
