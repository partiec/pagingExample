package ru.frolov.pagingexample.serv;

import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.frolov.pagingexample.model.Product;
import ru.frolov.pagingexample.repo.ProductRepository;

@Service
@Data
public class ProductService {

    private final ProductRepository productRepository;


    public Page<Product> listAll(int currentPage) {
        Pageable pageable = PageRequest.of(currentPage, 10);
        return this.productRepository.findAll(pageable);
    }
}
