package enums;

import java.math.BigDecimal;

public enum TaxiType {
    STANDART(new BigDecimal(10),new BigDecimal(30)),
    KOMFORT(new BigDecimal(20),new BigDecimal(50)),
    BUSINESS(new BigDecimal(30),new BigDecimal(100));

    private BigDecimal pricePerKim;
    private BigDecimal priseForLanding;

    TaxiType(BigDecimal pricePerKim, BigDecimal priseForLanding) {
        this.pricePerKim = pricePerKim;
        this.priseForLanding = priseForLanding;
    }

    public BigDecimal getPricePerKim() {
        return pricePerKim;
    }

    public void setPricePerKim(BigDecimal pricePerKim) {
        this.pricePerKim = pricePerKim;
    }

    public BigDecimal getPriseForLanding() {
        return priseForLanding;
    }

    public void setPriseForLanding(BigDecimal priseForLanding) {
        this.priseForLanding = priseForLanding;
    }
}
