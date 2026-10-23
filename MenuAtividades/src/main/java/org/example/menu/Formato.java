package org.example.menu;

import java.util.Locale;

public class Formato {
    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    public static String reais(double valor) {
        return String.format(BR, "R$ %.2f", valor);
    }

    public static String numero(double valor) {
        return String.format(BR, "%.1f", valor);
    }
}