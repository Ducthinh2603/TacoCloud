package tacos;

import lombok.Data;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {
    @NotNull
    @Size(min=5, max=20, message = "at least 5 characters")
    private String name;

    @NotNull
    @Size(min=1, message = "Choose at least 1 ingredient")
    private List<String> ingredients;
}
