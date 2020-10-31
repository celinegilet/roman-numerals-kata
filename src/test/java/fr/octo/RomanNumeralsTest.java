package fr.octo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void convert_shouldReturn_I_when_1() {
        // Given
        String expected = "I";

        // When
        String result = romanNumerals.convert(1);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_II_when_2() {
        // Given
        String expected = "II";

        // When
        String result = romanNumerals.convert(2);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_III_when_3() {
        // Given
        String expected = "III";

        // When
        String result = romanNumerals.convert(3);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_V_when_5() {
        // Given
        String expected = "V";

        // When
        String result = romanNumerals.convert(5);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_VI_when_6() {
        // Given
        String expected = "VI";

        // When
        String result = romanNumerals.convert(6);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_VII_when_7() {
        // Given
        String expected = "VII";

        // When
        String result = romanNumerals.convert(7);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_VIII_when_8() {
        // Given
        String expected = "VIII";

        // When
        String result = romanNumerals.convert(8);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_IV_when_4() {
        // Given
        String expected = "IV";

        // When
        String result = romanNumerals.convert(4);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_IX_when_9() {
        // Given
        String expected = "IX";

        // When
        String result = romanNumerals.convert(9);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_X_when_10() {
        // Given
        String expected = "X";

        // When
        String result = romanNumerals.convert(10);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XX_when_20() {
        // Given
        String expected = "XX";

        // When
        String result = romanNumerals.convert(20);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XXX_when_30() {
        // Given
        String expected = "XXX";

        // When
        String result = romanNumerals.convert(30);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XL_when_40() {
        // Given
        String expected = "XL";

        // When
        String result = romanNumerals.convert(40);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XL_when_50() {
        // Given
        String expected = "L";

        // When
        String result = romanNumerals.convert(50);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_LX_when_60() {
        // Given
        String expected = "LX";

        // When
        String result = romanNumerals.convert(60);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_LXX_when_70() {
        // Given
        String expected = "LXX";

        // When
        String result = romanNumerals.convert(70);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_LXXX_when_80() {
        // Given
        String expected = "LXXX";

        // When
        String result = romanNumerals.convert(80);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XC_when_90() {
        // Given
        String expected = "XC";

        // When
        String result = romanNumerals.convert(90);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_Empty_when_0() {
        // Given
        String expected = "";

        // When
        String result = romanNumerals.convert(0);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XXIII_when_23() {
        // Given
        String expected = "XXIII";

        // When
        String result = romanNumerals.convert(23);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XLV_when_45() {
        // Given
        String expected = "XLV";

        // When
        String result = romanNumerals.convert(45);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XLV_when_89() {
        // Given
        String expected = "LXXXIX";

        // When
        String result = romanNumerals.convert(89);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_XLV_when_91() {
        // Given
        String expected = "XCI";

        // When
        String result = romanNumerals.convert(91);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_CCCV_when_305() {
        // Given
        String expected = "CCCV";

        // When
        String result = romanNumerals.convert(305);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_CDLIX_when_459() {
        // Given
        String expected = "CDLIX";

        // When
        String result = romanNumerals.convert(459);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_DXC_when_590() {
        // Given
        String expected = "DXC";

        // When
        String result = romanNumerals.convert(590);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_DCC_when_700() {
        // Given
        String expected = "DCC";

        // When
        String result = romanNumerals.convert(700);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_DCC_when_937() {
        // Given
        String expected = "CMXXXVII";

        // When
        String result = romanNumerals.convert(937);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_MCXI_when_1111() {
        // Given
        String expected = "MCXI";

        // When
        String result = romanNumerals.convert(1111);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_MMDXCVII_when_2597() {
        // Given
        String expected = "MMDXCVII";

        // When
        String result = romanNumerals.convert(2597);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_MMMDCCCXLVIII_when_3848() {
        // Given
        String expected = "MMMDCCCXLVIII";

        // When
        String result = romanNumerals.convert(3848);

        // Then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_shouldReturn_MMMCMXCIX_when_3999() {
        // Given
        String expected = "MMMCMXCIX";

        // When
        String result = romanNumerals.convert(3999);

        // Then
        assertThat(result).isEqualTo(expected);
    }

}
