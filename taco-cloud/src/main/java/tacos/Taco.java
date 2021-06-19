package tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Taco {
    private Long id;

    private Date createdAt;

/*    public Taco(String name) {
        this.name = name;
    }*/

    public Taco() {

    }

    @NotNull
    @Size(min = 5, message = "The name must be at least 5 character long")
    private String name;

    @NotNull(message = "At least one ingredient must be chosen")
    private List<Ingredient> ingredients;
}
