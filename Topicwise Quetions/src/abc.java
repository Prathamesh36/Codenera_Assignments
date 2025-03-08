/*You are tasked with building a text analysis tool that processes input text concurrently using multiple threads.
 The tool should analyze the text to find the count of each unique word and provide a summary of the analysis.

Requirements:
WordAnalyzer Class (WordAnalyzer):

Create a class WordAnalyzer that represents the main component of the text analysis tool.
Include attributes for storing the input text and the results of the analysis.
Implement a constructor and appropriate methods for getting and updating attributes.
WordFrequency Class (WordFrequency):

Create a class WordFrequency to represent the frequency of a word.
Include attributes for the word and its frequency.
Implement methods for getting and updating the frequency.
TextAnalyzer Thread (TextAnalyzerThread):

Implement a class TextAnalyzerThread that extends Thread.
Each thread should process a portion of the input text and update the word frequencies in the WordAnalyzer.
Use proper synchronization mechanisms to avoid race conditions.
Exception Handling:

Implement proper exception handling throughout the program.
Handle cases such as empty input, invalid characters, or other potential issues.*/

import java.util.HashMap;
import java.util.Scanner;

class WordFrequency{
    public static void analyse(String s){
        String[] arr= s.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for (String el : hm.keySet()){
            System.out.println(el+"\t"+hm.get(el));
        }
    }
}

public class abc extends WordFrequency{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Strings: ");
        String s = sc.nextLine();
        analyse(s);
    }
}
