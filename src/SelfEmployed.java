public class SelfEmployed implements Customer {

    //Atributos
    private String code;
    private String name;
    private String surname;
    private String idNumber;
    private String postalAddress;
    private String city;
    private String province;
    private String email;
    private String phoneNumber;

    //Metodos
    public String getSurname (){ return surname;}
    public void setSurname(String surname){ this.surname = surname;}

    @Override
    public String getCode() {return code;}
    @Override
    public void setCode(String code) {this.code = code;}

    @Override
    public String getName() {return name;}
    @Override
    public void setName(String name) {this.name = name;}

    @Override
    public String getIdNumber() {return idNumber;}
    @Override
    public void setIdNumber(String idNumber) {this.idNumber = idNumber;}

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
    public void setPhoneNumber() {this.phoneNumber = phoneNumber;}

}
