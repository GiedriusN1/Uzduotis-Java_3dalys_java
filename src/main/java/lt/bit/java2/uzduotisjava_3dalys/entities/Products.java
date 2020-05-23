package lt.bit.java2.uzduotisjava_3dalys.entities;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
//@Table(name = "products")
//@NamedEntityGraph(name = "products.stores", attributeNodes = @NamedAttributeNode("stores"))
public class Products {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;

    public Products(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
