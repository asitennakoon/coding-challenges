package designpatterns.java;

public class Factory {
    public interface Mobile {
        double getPrice();
    }

    public static class Samsung implements Mobile {
        private double price;

        public Samsung(double price) {
            this.price = price;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }

    public static class Apple implements Mobile {
        private double price;

        public Apple(double price) {
            this.price = price;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }

    public static class MobileFactory {
        public static Mobile getInstance(String brand, double price) {
            if (brand.equalsIgnoreCase("Samsung")) {
                return new Samsung(price);
            } else {
                return new Apple(price);
            }
        }

        public static void main(String[] args) {
            Mobile samsung = MobileFactory.getInstance("Samsung", 50000);
            Mobile apple = MobileFactory.getInstance("Apple", 50000);
        }
    }
}
