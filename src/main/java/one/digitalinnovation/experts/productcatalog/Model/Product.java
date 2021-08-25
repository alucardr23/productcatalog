package one.digitalinnovation.experts.productcatalog.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@AllArgsConstructor
@Document(indexName = "product", type = "catalog")
public class Product {
    @Id
    private Long id;
    private String name;
    private Integer amount;




}
