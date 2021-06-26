package tacos;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
//@NoArgsConstructor
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Date createdAt;

/*    public Taco(String name) {
        this.name = name;
//    }*/
//
//    public Taco() {
//
//    }

    @NotNull
    @Size(min = 5, message = "The name must be at least 5 character long")
    private String name;

    @ManyToMany(targetEntity=Ingredient.class)
    @NotNull(message = "At least one ingredient must be chosen")
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}
