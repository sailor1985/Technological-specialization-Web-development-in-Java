package Intermediate_certification_programmer.DZ4;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String surname;
    private String name;
    private String patronymic;
    private Integer age;
    private String telephone;
}
