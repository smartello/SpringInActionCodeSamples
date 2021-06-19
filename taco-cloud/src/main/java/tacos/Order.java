package tacos;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class Order {
    private Long id;

    private Date placedAt;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Zip code is required")
    private String zip;

    @CreditCardNumber(message = "Credit card number is not valid")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([/])([0-9]{2})$", message = "Expiration date must be formatted as MM/YY")
    private String ccExpiration;

    @Digits(integer =  3, fraction = 0, message = "Invalid CVV")
    private String ccCVV;

    private List<Taco> designList = new ArrayList<>();

    public void addDesign(Taco design) {
        designList.add(design);
    }
}
