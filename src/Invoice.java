import java.util.Date;

public class Invoice {

    //Atributos
    private String code;
    private Date date;
    private Float baseAmount;
    private Float total;
    private Product product;
    private Service service;
    private SelfEmployed selfEmployed;
    private Company company;

    //Metodos
    public String getCode(){return code;}
    public void setCode(String code){this.code = code;}

    public Date getDate (){return date;}
    public void setDate (Date date){this.date = date;}

    public Float getBaseAmount(){return baseAmount;}
    public void setBaseAmount(Float baseAmount){this.baseAmount = baseAmount;}

    public Float getTotal(){return total;}
    public void setTotal(Float total){this.total = total;}

    public Product getProduct(){return product;}
    public void setProduct(Product product){this.product = product;}

    public Service getService() {return service;}
    public void setService(Service service) {this.service = service;}

    public SelfEmployed getSelfEmployed(){return selfEmployed;}
    public void setSelfEmployed(SelfEmployed selfEmployed){this.selfEmployed = selfEmployed;}

    public Company getCompany(){return company;}
    public void setCompany(Company company){this.company = company;}
}
