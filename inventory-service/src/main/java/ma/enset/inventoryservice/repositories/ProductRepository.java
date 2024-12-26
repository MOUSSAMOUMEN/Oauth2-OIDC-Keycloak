package ma.enset.inventoryservice.repositories;

import ma.enset.inventoryservice.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
