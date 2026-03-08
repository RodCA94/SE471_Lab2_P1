import java.util.List;
import java.util.ArrayList;

public class client {
    public static void main(String[] args) {

        // Generated a list of random products with price and ratings
        List<Product>  products = new ArrayList<>();
        products.add(new Product("1", "iPhone", 1000, "Apple", "Electronics", 4.5 ));
        products.add(new Product("2", "MacBook", 1800, "Apple", "Electronics", 3.8));
        products.add(new Product("3", "AirPods", 200, "Apple", "Electronics", 4.2));
        products.add(new Product("4", "Galaxy Phone", 900, "Samsung", "Electronics", 2.4));
        products.add(new Product("5", "Galaxy Tablet", 700, "Samsung", "Electronics", 1.1));
        products.add(new Product("6", "Dell Laptop", 1200, "Dell", "Electronics", 2.3));
        products.add(new Product("7", "HP Printer", 250, "HP", "Electronics", 3.9));
        products.add(new Product("8", "Sony Headphones", 300, "Sony", "Electronics", 4.6));
        products.add(new Product("9", "Nintendo Switch", 300, "Nintendo", "Electronics", 4.7));
        products.add(new Product("10", "Xbox Controller", 70, "Microsoft", "Electronics", 3.4));
        products.add(new Product("11", "Nike Running Shoes", 120, "Nike", "Clothing", 4.1));
        products.add(new Product("12", "Adidas Hoodie", 80, "Adidas", "Clothing", 4.0));
        products.add(new Product("13", "Levi Jeans", 90, "Levi", "Clothing", 4.2));
        products.add(new Product("14", "North Face Jacket", 200, "North Face", "Clothing", 4.6));
        products.add(new Product("15", "Under Armour Shorts", 40, "Under Armour", "Clothing", 3.8));
        products.add(new Product("16", "Instant Pot", 100, "InstantPot", "Home", 4.7));
        products.add(new Product("17", "Dyson Vacuum", 500, "Dyson", "Home", 4.5));
        products.add(new Product("18", "Coffee Maker", 150, "Keurig", "Home", 2.3));
        products.add(new Product("19", "Office Chair", 220, "HermanMiller", "Furniture", 4.9));
        products.add(new Product("20", "Standing Desk", 450, "FlexiSpot", "Furniture", 4.4));
        products.add(new Product("21", "PlayStation 5", 500, "Sony", "Electronics", 4.9));
        products.add(new Product("22", "Razer Gaming Mouse", 80, "Razer", "Electronics", 3.4));
        products.add(new Product("23", "Logitech Keyboard", 120, "Logitech", "Electronics", 2.3));
        products.add(new Product("24", "Canon Camera", 950, "Canon", "Electronics", 3.6));
        products.add(new Product("25", "GoPro Camera", 400, "GoPro", "Electronics", 1.5));
        products.add(new Product("26", "Samsung Monitor", 300, "Samsung", "Electronics", 4.2));
        products.add(new Product("27", "LG OLED TV", 1500, "LG", "Electronics", 4.8));
        products.add(new Product("28", "Bose Speaker", 250, "Bose", "Electronics", 4.7));
        products.add(new Product("29", "Apple Watch", 450, "Apple", "Electronics", 4.6));
        products.add(new Product("30", "Fitbit Tracker", 180, "Fitbit", "Electronics", 3.1));
        products.add(new Product("31", "Puma Sneakers", 110, "Puma", "Clothing", 1.0));
        products.add(new Product("32", "Columbia Jacket", 170, "Columbia", "Clothing", 4.3));
        products.add(new Product("33", "Patagonia Sweater", 140, "Patagonia", "Clothing", 4.7));
        products.add(new Product("34", "Champion Hoodie", 70, "Champion", "Clothing", 3.9));
        products.add(new Product("35", "Vans Skate Shoes", 85, "Vans", "Clothing", 3.2));
        products.add(new Product("36", "KitchenAid Mixer", 380, "KitchenAid", "Home", 4.8));
        products.add(new Product("37", "Air Fryer", 130, "Ninja", "Home", 4.5));
        products.add(new Product("38", "Robot Vacuum", 320, "Roomba", "Home", 2.4));
        products.add(new Product("39", "Bookshelf", 200, "IKEA", "Furniture", 1.1));
        products.add(new Product("40", "Desk Lamp", 60, "Philips", "Home", 2.0));
        products.add(new Product("41", "Camping Tent", 220, "Coleman", "Outdoors", 4.5));
        products.add(new Product("42", "Sleeping Bag", 90, "Coleman", "Outdoors", 4.2));
        products.add(new Product("43", "Hiking Backpack", 140, "Osprey", "Outdoors", 4.7));
        products.add(new Product("44", "Water Bottle", 30, "HydroFlask", "Outdoors", 4.4));
        products.add(new Product("45", "Yoga Mat", 50, "Gaiam", "Sports", 2.1));
        products.add(new Product("46", "Dumbbell Set", 200, "Bowflex", "Sports", 2.6));
        products.add(new Product("47", "Basketball", 35, "Spalding", "Sports", 4.3));
        products.add(new Product("48", "Soccer Ball", 28, "Adidas", "Sports", 4.0));
        products.add(new Product("49", "Treadmill", 900, "NordicTrack", "Sports", 4.5));
        products.add(new Product("50", "Golf Clubs", 750, "Callaway", "Sports", 4.8));
        products.add(new Product("51", "Dining Table", 650, "Ashley", "Furniture", 3.2));
        products.add(new Product("52", "Office Desk", 350, "IKEA", "Furniture", 1.1));
        products.add(new Product("53", "Recliner Chair", 500, "La-Z-Boy", "Furniture", 1.6));
        products.add(new Product("54", "Bed Frame", 400, "Zinus", "Furniture", 2.4));
        products.add(new Product("55", "Nightstand", 120, "IKEA", "Furniture", 3.0));
        products.add(new Product("56", "Winter Coat", 180, "Columbia", "Clothing", 4.5));
        products.add(new Product("57", "Running Shorts", 45, "Nike", "Clothing", 4.2));
        products.add(new Product("58", "Baseball Cap", 25, "New Era", "Clothing", 4.1));
        products.add(new Product("59", "Flannel Shirt", 60, "Carhartt", "Clothing", 4.3));
        products.add(new Product("60", "Work Boots", 160, "Timberland", "Clothing", 4.7));
        products.add(new Product("61", "Apple Vision Pro", 4000, "Apple", "Electronics", 1.0));

        // Print all products
        System.out.println("All Products:");
        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getBrand() + " " + p.getCategory() + " " + p.getCustomerRating());
        }

        // Individual Criteria
        System.out.println("\nApple Products:");
        FilterIF appleProducts = new BrandFilter("Apple");
        List<Product> filterResults = appleProducts.meetCriteria(products);

        // print out results
        for (Product p : filterResults) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getBrand() + " " + p.getCategory() + " " + p.getCustomerRating());
        }

        // Series of criteria
        System.out.println("\nElectronics Products between $10-$300:");
        FilterIF electronicsProducts = new CategoryFilter("Electronics");
        FilterIF priceRangeFilter = new PriceRangeFilter(10, 300);
        // first filter
        List<Product> seriesFilterResults = electronicsProducts.meetCriteria(products);
        // second filter
        seriesFilterResults = priceRangeFilter.meetCriteria(seriesFilterResults);

        // print out results
        for (Product p : seriesFilterResults) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getBrand() + " " + p.getCategory() + " " + p.getCustomerRating());
        }

    }
}
