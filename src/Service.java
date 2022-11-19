public class Service implements SalesLine{

    //Atributos
    private String code;
    private String name;
    private Double price;
    private VatRate vatRate;


    //Metodos
    @Override
    public String getCode() {return code;}
    @Override
    public void setCode(String code) {this.code = code;}

    @Override
    public String getName() {return name;}

    @Override
    public void setName(String name) {this.name = name;}

    @Override
    public Double getPrice() {return price;}

    @Override
    public void setPrice(Double price) {this.price = price;}


    public VatRate getVatRate(){return vatRate;}
    public void setVatRate(VatRate vatRate){this.vatRate = vatRate;}
}
