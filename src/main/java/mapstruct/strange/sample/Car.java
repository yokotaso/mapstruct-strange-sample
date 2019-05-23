package mapstruct.strange.sample;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends AbstractCar {
    String carNumber;
    Boolean carType;
}
