package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO productDAO;

    @Override
    public int insertProduct(ProductVO vo) { return productDAO.insertProduct(vo); }

    @Override
    public int deleteProduct(int num) {
        return productDAO.deleteProduct(num);
    }

    @Override
    public int updateProduct(ProductVO vo) {
        return productDAO.updateProduct(vo);
    }

    @Override
    public ProductVO getProduct(int num) {
        return productDAO.getProduct(num);
    }

    @Override
    public List<ProductVO> getProductList() {
        return productDAO.getProductList();
    }
}
