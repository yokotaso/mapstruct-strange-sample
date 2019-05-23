package mapstruct.strange.sample;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(// config = Config.class,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
interface CarMapper {
    void copyToCarDto(Car car, @MappingTarget CarDto carDto);

    void copyToCar(@MappingTarget Car car, CarDto carDto);

}
