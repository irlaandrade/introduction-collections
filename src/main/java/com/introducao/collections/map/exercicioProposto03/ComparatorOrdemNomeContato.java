package com.introducao.collections.map.exercicioProposto03;

import java.util.Comparator;
import java.util.Map;

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}