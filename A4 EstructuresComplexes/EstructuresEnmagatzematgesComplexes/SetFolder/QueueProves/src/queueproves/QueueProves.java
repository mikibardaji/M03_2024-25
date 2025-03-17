/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueproves;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author mabardaji
 */
public class QueueProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        colaFIFO();
        colaLIFO();
        colaPrioritat();


    }

    private static void colaLIFO() {
                Deque<String> stack = new ArrayDeque<>(); // Implementació LIFO
/*ArrayDeque és més eficient que LinkedList
LinkedList usa nodes enllaçats i té més despesa de mem?ria.
ArrayDeque és més ràpid en accessos a les puntes de la cua.t).*/
        System.out.println("Inserto Primer, segon i tercer");
        stack.push("Primer");
        stack.push("Segon");
        stack.push("Tercer");

        while (!stack.isEmpty()) {
            System.out.println("Processant: " + stack.pop());
        }
    }

    private static void colaFIFO() {
        Queue<String> queue = new LinkedList<>(); // Implementació FIFO
        System.out.println("Inserto Primer, segon i tercer");
        queue.offer("Primer");
        queue.offer("Segon");
        queue.offer("Tercer");

        while (!queue.isEmpty()) {
            System.out.println("Processant: " + queue.poll());
        }

    }

    private static void colaPrioritat() {
                // Creem la cua de processos amb ordenació per prioritat
        Queue<Proces> cuaProcessos = new PriorityQueue<>(new ComparadorProces());

        // Afegim processos a la cua
        cuaProcessos.offer(new Proces("Actualitzar Base de Dades", 3));
        cuaProcessos.offer(new Proces("Fer c?pia de seguretat", 1));
        cuaProcessos.offer(new Proces("Enviar correus", 2));
        cuaProcessos.offer(new Proces("Analitzar logs", 5));
        cuaProcessos.offer(new Proces("Optimitzar mem?ria", 4));

        // Processant els processos en ordre de prioritat
        System.out.println("? Processant tasques en ordre de prioritat:");
        while (!cuaProcessos.isEmpty()) {
            System.out.println("-> " + cuaProcessos.poll());
        }

    }
    
}
