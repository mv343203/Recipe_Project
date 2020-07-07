package vome.springframework.domain;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne (fetch = FetchType.EAGER)
    private UnitOfMeasure uom;


    public Ingredient(){

    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}
