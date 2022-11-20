import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    //Atributos
    private String code;
    private Date date;
    private Double baseAmount;
    private Double total;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Service> services = new ArrayList<>();
    private SelfEmployed selfEmployed;
    private Company company;

    //Metodos
    public String getCode(){return code;}
    public void setCode(String code){this.code = code;}

    public Date getDate (){return date;}
    public void setDate (Date date){this.date = date;}

    public Double getBaseAmount(){
        baseAmount = 0.0;
        for (Integer i = 0 ; i < products.size(); i ++){
            baseAmount = baseAmount + (products.get(i).getPrice());
        }
        for (Integer j = 0 ; j < services.size(); j++){
            baseAmount = baseAmount + (services.get(j).getPrice());
        }
        return baseAmount;
    }
    public void setBaseAmount(Double baseAmount){this.baseAmount = baseAmount;}

    public Double getTotal(){
        total = 0.0;
        for (Integer i = 0 ; i < products.size(); i ++){
            total = total + (products.get(i).getPrice() + (products.get(i).getPrice()*products.get(i).getVatRate().getType()/100));
        }
        for (Integer j = 0 ; j < services.size(); j++){
            baseAmount = baseAmount + (services.get(j).getPrice() + (services.get(j).getPrice()*services.get(j).getVatRate().getType()/100));
        }
        return total;
    }
    public void setTotal(Double total){this.total = total;}

    public ArrayList<Product> getProduct(){return this.products;}
    public void addProduct(Product product){this.products.add(product);}

    public ArrayList<Service> getServices() {return this.services;}
    public void addService (Service service) {this.services.add(service);}

    public SelfEmployed getSelfEmployed(){return selfEmployed;}
    public void setSelfEmployed(SelfEmployed selfEmployed){this.selfEmployed = selfEmployed;}

    public Company getCompany(){return company;}
    public void setCompany(Company company){this.company = company;}
}
