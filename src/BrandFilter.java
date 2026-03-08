import java.util.List;
import java.util.ArrayList;

public class BrandFilter implements FilterIF {
    private String brand;

    public BrandFilter(String brand) {
        this.brand = brand;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getBrand().equals(brand)) {
                filteredProducts.add(p);
            }
        }
        return filteredProducts;
    }
}
