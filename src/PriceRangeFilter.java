import java.util.List;
import java.util.ArrayList;

public class PriceRangeFilter implements FilterIF {
    private double minPrice;
    private double maxPrice;

    public PriceRangeFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
                filteredProducts.add(p);
            }
        }
        return filteredProducts;
    }
}
