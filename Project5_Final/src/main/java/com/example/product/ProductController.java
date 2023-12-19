package product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String productlist(Model model) {
        model.addAttribute("list", productService.getProductList());
        return "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct() {
        return "addproductform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addProductOk(ProductVO vo) {
        if(productService.insertProduct(vo) == 0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editProduct(@PathVariable("id") int id, Model model) {
        ProductVO productVO = productService.getProduct(id);
        model.addAttribute("u", productVO);
        return "editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editProductOK(ProductVO vo) {
        int i = productService.updateProduct(vo);
        if(i == 0)
            System.out.println("데이터 수정 실패 ");
        else
            System.out.println("데이터 수정 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
    public String deleteProductOk(@PathVariable("id") int id) {
        if(productService.deleteProduct(id) == 0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공!!!");
        return "redirect:../list";
    }

    @RequestMapping(value = "/view/{id}", method=RequestMethod.GET)
    public String viewProduct(@PathVariable("id") int id, Model model) {
        ProductVO productVO = productService.getProduct(id);
        model.addAttribute("u", productVO);
        return "view";
    }
}
