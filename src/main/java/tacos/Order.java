package tacos;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class Order {
    @NotBlank(message = "Required")
    private String name;

    @NotBlank(message = "Required")
    private String street;

    @NotBlank(message = "Required")
    private String city;

    @NotBlank(message = "Required")
    private String state;

    @NotBlank(message = "Required")
    private String zip;


    @CreditCardNumber(message = "Not valid number")
    private String ccNumber;

    @Pattern(regexp = "^0[1-9]|1[0-2]([/])([1-9][0-9])$")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 2, message = "Invalid CVV")
    private String ccCVV;
}
