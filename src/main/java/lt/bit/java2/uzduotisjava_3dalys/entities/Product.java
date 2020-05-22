package lt.bit.java2.uzduotisjava_3dalys.entities;


import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
//@Table(name = "product")
//@NamedEntityGraph(name = "products.stores", attributeNodes = @NamedAttributeNode("stores"))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;

}
