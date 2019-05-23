package mapstruct.strange.sample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto extends AbstractCarDto {
    Long carNumber;
    String carType;
}
