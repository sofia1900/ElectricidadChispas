public class Company implements Customer{

    //Atributos
    private String code;
    private String bussinesName;
    private String cif;
    private String postalAddress;
    private String city;
    private String province;
    private String email;
    private String phoneNumber;


    //Metodos
    @Override
    public String getCode() {return code;}
    @Override
    public void setCode(String code) {this.code = code;}

    @Override
    public String getName() {return bussinesName;}
    public void setBussinesName(String bussinesName) {this.bussinesName = bussinesName;}

    @Override
    public String getIdNumber() {return cif;}
    public void setCif(String cif) {this.cif = cif;}

    @Override
    public String getPostalAddress() {return postalAddress;}
    @Override
    public void setPostalAddress(String postalAddress) {this.postalAddress = postalAddress;}

    @Override
    public String getCity() {return city;}
    @Override
    public void setCity(String city) {this.city = city;}

    @Override
    public String getProvince() {return province;}
    @Override
    public void setProvince(String province) {this.province = province;}

    @Override
    public String getEmail() {return email;}
    @Override
    public void setEmail(String email) {this.email = email;}

    @Override
    public String getPhoneNumber() {return phoneNumber;}
    @Override
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

}
