package designpatterns.java;

public class Vehicle {
    private String manufacturer;
    private String model;
    private String year;
    private String country;
    private double price;

    private Vehicle() {
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }

    public static class VehicleBuilder {
        private Vehicle vehicle;

        public VehicleBuilder() {
            vehicle = new Vehicle();
        }

        public VehicleBuilder manufacturer(String manufacturer) {
            vehicle.setManufacturer(manufacturer);
            return this;
        }

        public VehicleBuilder model(String model) {
            vehicle.setModel(model);
            return this;
        }

        public VehicleBuilder year(String year) {
            vehicle.setYear(year);
            return this;
        }

        public VehicleBuilder country(String country) {
            vehicle.setCountry(country);
            return this;
        }

        public VehicleBuilder price(double price) {
            vehicle.setPrice(price);
            return this;
        }

        public Vehicle build() {
            return vehicle;
        }
    }

    public static void main(String[] args) {
        VehicleBuilder vehicleBuilder = new VehicleBuilder();
        Vehicle vehicle = vehicleBuilder
                .manufacturer("Toyota")
                .country("Japan")
                .price(2000)
                .build();
        System.out.println(vehicle);
    }
}
