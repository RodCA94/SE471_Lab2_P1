import java.util.List;
import java.util.ArrayList;

public class CustomerRatingFilter implements FilterIF {
    private double minRating;
    private double maxRating;

    public CustomerRatingFilter(double minRating, double maxRating) {
        this.minRating = minRating;
        this.maxRating = maxRating;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product p : products) {
            if (p.getCustomerRating() >= minRating && p.getCustomerRating() <= maxRating) {
                filteredProducts.add(p);
            }
        }
        return filteredProducts;
    }
}
