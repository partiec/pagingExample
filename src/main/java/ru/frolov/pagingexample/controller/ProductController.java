package ru.frolov.pagingexample.controller;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.frolov.pagingexample.model.Product;
import ru.frolov.pagingexample.serv.ProductService;

import java.util.List;

@Controller
@Data
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String viewHomePage(Model model) {

        return listByPage(model, 1);
    }

    @GetMapping("page/{pageNumber}")
    public String listByPage(
            Model model,
            @PathVariable("pageNumber") int currentPage) {

        Page<Product> page = this.productService.listAll(currentPage);

        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        List<Product> listProducts = page.getContent();

        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("listProducts", listProducts);

        return "index";
    }
}
