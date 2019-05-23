package mapstruct.strange.sample;

import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.math.BigInteger;

@Mapper
public class StringToNumberMapper {


    public Byte stringToByte(String source) {
        return null;
    }

    public Short stringToShort(String source) {
        return null;
    }

    public Integer stringToInteger(String source) {
        return null;
    }

    public Long stringToLong(String source) {
        return null;
    }

    public BigInteger stringToBigInteger(String source) {
        return BigInteger.valueOf(0L);
    }

    public Float stringToFloat(String source) {
        return null;
    }

    public Double stringToDouble(String source) {
        return null;
    }

    public BigDecimal stringToBigDecimal(String source) {
        return null;
    }
}
