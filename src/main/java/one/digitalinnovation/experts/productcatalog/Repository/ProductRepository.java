package one.digitalinnovation.experts.productcatalog.Repository;

import one.digitalinnovation.experts.productcatalog.Model.Product;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@AutoConfigurationPackage

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
