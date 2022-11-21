public class InvoicePrinter {
    public void print(Invoice invoice){
        System.out.println("Factura: " + invoice.getCode() + "|" + invoice.getDate());

        if (invoice.getSelfEmployed()!= null) {
            System.out.println("Cliente: " + invoice.getSelfEmployed().getIdNumber() + " | " + invoice.getSelfEmployed().getFullName() +
                    " | " + invoice.getSelfEmployed().getPostalAddress() + " | " + invoice.getSelfEmployed().getCity() + " | " +
                    invoice.getSelfEmployed().getProvince() + " | " + invoice.getSelfEmployed().getEmail());
        } else {
            System.out.println("Cliente: " + invoice.getCompany().getIdNumber() + " | " + invoice.getCompany().getName() + " | " +
                    invoice.getCompany().getPostalAddress() + " | " + invoice.getCompany().getCity() + " | " +
                    invoice.getCompany().getProvince() + " | " + invoice.getCompany().getEmail());
        }

        System.out.println("Linea de venta (producto|servicio): Codigo | Nombre | Precio | tipo IVA | Total");
        for (Integer i = 0 ; i < invoice.getProduct().size() ; i++){
            System.out.println(invoice.getProduct().get(i).getCode() + " | " + invoice.getProduct().get(i).getName() + " | " +
                    invoice.getProduct().get(i).getPrice() + "€" + " | " + invoice.getProduct().get(i).getVatRate().getType() +"%"+ " | " +
                    (invoice.getProduct().get(i).getPrice()+(invoice.getProduct().get(i).getVatRate().getType()*invoice.getProduct().get(i).getPrice()/100))+"€");
        }
        for (Integer i = 0 ; i < invoice.getServices().size() ; i++){
            System.out.println(invoice.getServices().get(i).getCode() + " | " + invoice.getServices().get(i).getName() + " | " +
                    invoice.getServices().get(i).getPrice() +"€"+ " | " + invoice.getServices().get(i).getVatRate().getType() +"%"+ " | " +
                    (invoice.getServices().get(i).getPrice() + (invoice.getServices().get(i).getVatRate().getType()*invoice.getServices().get(i).getPrice()/100))+"€");
        }
        System.out.println("TOTAL = " + invoice.getTotal() +"€ \n");
    }
    
}
