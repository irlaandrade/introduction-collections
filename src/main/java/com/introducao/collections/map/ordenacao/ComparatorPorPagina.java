package com.introducao.collections.map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPagina implements Comparator<Map.Entry<String, Livro>> {
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
