package com.introducao.collections.map.paraSaberMais;

import java.util.Comparator;

class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {
    public int compare(Disciplina disc1, Disciplina disc2) {
        return Integer.compare(disc1.getDuracao(), disc2.getDuracao());
    }
}
