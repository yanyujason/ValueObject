import org.junit.Test;

import static junit.framework.Assert.*;

public class EuroTest {
    @Test
    public void shouldNotSameForTwoFiveEuros(){
        Euro fiveEuro1 = new Euro(5);
        Euro fiveEuro2 = new Euro(5);
        assertNotSame("", fiveEuro1, fiveEuro2);
    }

    @Test
    public void shouldBeEqualForTwo5Euros(){
        Euro euro1 = new Euro(5);
        Euro euro2 = new Euro(5);
        assertEquals(euro1, euro2);
    }

    @Test
    public void shouldNotEqualForFiveEurosAndTenEuros(){
        assertFalse(new Euro(5).equals(new Euro(10)));
    }

    @Test
    public void shouldTenEurosNotEqualsToNull(){
        assertFalse(new Euro(10).equals(null));
    }

    @Test
    public void shouldTenEurosNotEqualToObject(){
        assertFalse(new Euro(10).equals(new Object()));
    }

    @Test
    public void shouldTenEurosEqualsToThreeEurosPlusSevenEuros(){
        assertTrue(new Euro(10).equals(new Euro(3).plus(new Euro(7))));
    }

    @Test
    public void tenEurosNotEqualToTwoEurosPlusThreeEuros(){
        assertFalse(new Euro(10).equals(new Euro(2).plus(new Euro(3))));
    }

    @Test
    public void shouldReturnFalseWhenTenEurosEqualsToTenDollars(){
        assertFalse(new Euro(10).equals(new Dollar(10)));
    }

    @Test
    public void shouldReturnTrueWhenCompareTenEurosAndTwelveDollars(){
        assertEquals(new Euro(10), new Dollar(12));
    }

}
