package mapstruct.strange.sample;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-22T00:11:58+0900",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
class CarMapperImpl implements CarMapper {

    @Override
    public void copyToCarDto(Car car, CarDto carDto) {
        if ( car == null ) {
            return;
        }

        if ( car.getPower() != null ) {
            carDto.setPower( Long.parseLong( car.getPower() ) );
        }
        else {
            carDto.setPower( null );
        }
        if ( car.getRequired() != null ) {
            carDto.setRequired( Boolean.parseBoolean( car.getRequired() ) );
        }
        else {
            carDto.setRequired( null );
        }
        if ( car.getCarNumber() != null ) {
            carDto.setCarNumber( Long.parseLong( car.getCarNumber() ) );
        }
        else {
            carDto.setCarNumber( null );
        }
        if ( car.getCarType() != null ) {
            carDto.setCarType( String.valueOf( car.getCarType() ) );
        }
        else {
            carDto.setCarType( null );
        }
    }

    @Override
    public void copyToCar(Car car, CarDto carDto) {
        if ( carDto == null ) {
            return;
        }

        if ( carDto.getPower() != null ) {
            car.setPower( String.valueOf( carDto.getPower() ) );
        }
        else {
            car.setPower( null );
        }
        if ( carDto.getRequired() != null ) {
            car.setRequired( String.valueOf( carDto.getRequired() ) );
        }
        else {
            car.setRequired( null );
        }
        if ( carDto.getCarNumber() != null ) {
            car.setCarNumber( String.valueOf( carDto.getCarNumber() ) );
        }
        else {
            car.setCarNumber( null );
        }
        if ( carDto.getCarType() != null ) {
            car.setCarType( Boolean.parseBoolean( carDto.getCarType() ) );
        }
        else {
            car.setCarType( null );
        }
    }
}
