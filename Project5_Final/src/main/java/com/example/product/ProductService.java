package product;

import java.util.List;

public interface ProductService {
    public int insertProduct(ProductVO vo);
    public int deleteProduct(int num);
    public int updateProduct(ProductVO vo);
    public ProductVO getProduct(int num);
    public List<ProductVO> getProductList();
}
