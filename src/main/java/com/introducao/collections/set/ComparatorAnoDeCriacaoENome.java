package com.introducao.collections.set;

import java.util.Comparator;

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
