package tacos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "The name must be at least 5 character long")
    private final String name = "";

    @Size(min = 1, message = "At least one ingredient must be chosen")
    private List<String> ingredients;
}
