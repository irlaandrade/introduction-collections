package com.introducao.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class ExercicioProposto02 {
    public static void main(String[] args) {
        int quantLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < quantLancamentos; i++) {
            int number = geradorDeLancamento.nextInt(6) + 1;
            valores.add(number);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        System.out.print("Jogando");
        //conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }

    /*
    O %d é utilizado para formatar variáveis inteiras, basicamente pode ser usado da seguinte forma:

    %d - formata uma variável inteira com quantos dígitos existirem;

    %4d - formata uma variável inteira com quantos dígitos existirem, mas se a variável tiver uma quantidade menor do que 4 dígitos, preenche os faltantes com espaço em branco à esquerda;

    %04d - formata uma variável inteira com quantos dígitos existirem, mas se a variável tiver uma quantidade menor do que 4 dígitos, preenche os faltantes com zeros à esquerda.

    Exemplos:

    %d aplicado a 1234 ficaria 1234;

    %4d aplicado a 1234 ficaria 1234, mas aplicado a 123 ficaria _123 (onde _ é um espaço em branco);

    %04d aplicado a 123 ficar 0123.
     */
}
