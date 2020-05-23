package lt.bit.java2.uzduotisjava_3dalys.repositories;

import lt.bit.java2.uzduotisjava_3dalys.entities.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductsRepository extends CrudRepository<Products, Integer> {

    Optional<Products> findById(Integer id);
}
