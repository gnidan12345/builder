public class Address
{

    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String apartmentNumber;
    private String district;
    private String landmark;
    private String latitude;
    private String longitude;

    public Address() {
    }

//    public Address(String street, String city) {
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.postalCode = postalCode;
//        this.country = country;
//        this.apartmentNumber = apartmentNumber;
//        this.district = district;
//        this.landmark = landmark;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }


    public static class Builder{

        // поле типу Address
        private Address address;
        private String street;
        private String city;
        private String state;
        private String postalCode;
        private String country;
        private String apartmentNumber;
        private String district;
        private String landmark;
        private String latitude;
        private String longitude;

        // конструктор який ініціалізую поле address
        public Builder() {
            address = new Address();
        }
        // модифіковані сеттери
        // сетає поле address.street(типу Address) значенням street(яке приходить ззовні)
        public Builder street(String street){
           address.street = street;
            return this;
        }

        public Builder city(String city){
        address.city = city;
        return this;
        }

        public Builder postalCode(String postalCode){
            address.postalCode = postalCode;
            return this;
        }

        public Builder country(String country){
            address.country = country;
            return this;
        }

        public Builder apartmentNumber(String apartmentNumber){
            address.apartmentNumber = apartmentNumber;
            return this;
        }

        public Builder district(String district){
            address.district = district;
            return this;
        }

        public Builder landmark(String landmark){
            address.landmark = landmark;
            return this;
        }

        public Builder latitude(String latitude){
            address.latitude = latitude;
            return this;
        }

        public Builder longitude(String longitude){
            address.longitude = longitude;
            return this;
        }

        // геттер
        // вертає поле address
        public Address build(){
        return  address;
        }





    }
}
