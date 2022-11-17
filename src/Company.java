public class Company implements Customer{

    //Atributos
    String code;
    String name;
    String idNumber;
    String postalAdress;
    String city;
    String province;
    String email;
    String phoneNumber;


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
    public String getIdNumber() {return idNumber;}
    @Override
    public void setIdNumber(String idNumber) {this.idNumber = idNumber;}

    @Override
    public String getPostalAddress() {return postalAdress;}
    @Override
    public void setPostalAddress(String postalAddress) {this.postalAdress = postalAddress;}

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
