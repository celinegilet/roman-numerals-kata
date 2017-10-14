package fr.octo;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";
    public static final String L = "L";
    public static final String C = "C";
    public static final String D = "D";
    public static final String M = "M";

    public String convert(int number) {
        return digitToRoman(number / 1000, M, "", "") +
                digitToRoman((number % 1000) / 100, C, D, M) +
                digitToRoman((number % 100) / 10, X, L, C) +
                digitToRoman(number % 10, I, V, X);
    }

    private String digitToRoman(int number, String unitSymbol, String halfSymbol, String groupSymbol) {
        if (number == 4) {
            return unitSymbol + halfSymbol;
        }
        if (number == 9) {
            return unitSymbol + groupSymbol;
        }
        if (number >= 5) {
            return halfSymbol + repeat(unitSymbol, number - 5);
        }
        return repeat(unitSymbol, number);
    }

    private String repeat(String symbol, int number) {
        return join("", nCopies(number, symbol));
    }

}
