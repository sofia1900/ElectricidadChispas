import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    //Atributos
    private String code;
    private Date date;
    private Float baseAmount;
    private Float total;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Service> services = new ArrayList<>();
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

    public ArrayList<Product> getProduct(){return this.products;}
    public void addProduct(Product product){this.products.add(product);}

    public ArrayList<Service> getServices() {return this.services;}
    public void addService (Service service) {this.services.add(service);}

    public SelfEmployed getSelfEmployed(){return selfEmployed;}
    public void setSelfEmployed(SelfEmployed selfEmployed){this.selfEmployed = selfEmployed;}

    public Company getCompany(){return company;}
    public void setCompany(Company company){this.company = company;}
}
