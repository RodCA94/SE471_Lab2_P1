import java.util.List;
import java.util.ArrayList;

public class CategoryFilter implements FilterIF {
    private String category;

    public CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public List<Product> meetCriteria(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
