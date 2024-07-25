package ru.frolov.pagingexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.frolov.pagingexample.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
