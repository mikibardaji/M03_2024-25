/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class HashMapProves {

    
    private final Map<String, Integer> grades;
    /**
     * @param args the command line arguments
     */
    public HashMapProves() {
        grades = new HashMap<>();
    }

    public static void main(String[] args) {
        HashMapProves mg = new HashMapProves();
        mg.run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        //load test data
        initializeData();
        //display grades
        displayGrades();
        //calculate mean grade
        int meanGrade = calculateGlobalMean();
        System.out.println("Mean grade=" + meanGrade);
        //modify a grade by student name
        System.out.print("Input a student name to modify grade: ");
        String name = sc.next();
        System.out.print("Input new grade: ");
        Integer grade = sc.nextInt();
        if (grades.containsKey(name)) { //assess key exists
            grades.replace(name, grade);
        }
        displayGrades();
    }

    /**
     * initialize test data
     */
    private void initializeData() {
        System.out.println("John insert " + grades.put("John", 6));
        System.out.println("Mary insert " + grades.put("Mary", 7));
        grades.put("Laura", 4);
        grades.put("Peter", 3);
        grades.put("Joseph", 8);
        grades.put("Sophie", 5);
        System.out.println("Mary reinsert " + grades.put("Mary",15 ));
    }

    /**
     * displays all grades
     */
    public void displayGrades() {
        System.out.println("=== Grades ===");
        Set<String> names = grades.keySet();
        for (String name : names) {
            System.out.format("%s: %d\n", name, grades.get(name));
        }
        System.out.format("%d grades displayed\n", grades.size());
    }

    /**
     * calculates global mean grade
     */
    public Integer calculateGlobalMean() {
        Collection<Integer> values = grades.values();
        return calcMean(values);
    }

    /**
     * calculates mean of data
     *
     * @param data the data collection to calculate mean
     * @return mean of data
     */
    private Integer calcMean(Collection<Integer> data) {
        Integer result = 0;
        for (Integer e : data) {
            result += e;
        }
        result /= data.size();
        return result;
    }

    
}
