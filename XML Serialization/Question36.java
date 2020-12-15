import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.beans.XMLEncoder;

//this is a hard coded example of XML serialization that takes in 4 words from a text file

public class Question36 extends Words{
  public static void main(String[] args){
    List<String> list = new ArrayList<>();  //list to store read-in values
    List<String> wordsList = new ArrayList<>();
    LinkedList<String> linkedlist = new LinkedList<String>();
  try{
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
      String line = br.readLine();

      while(line != null){
        int i = 0;
        String[] tokenize = line.split(" ");
        linkedlist.add(tokenize[i]);
        linkedlist.add(tokenize[i+1]);
        linkedlist.add(tokenize[i+2]);
        linkedlist.add(tokenize[i+3]);
        line = br.readLine();
      }
      br.close();
      Collections.sort(linkedlist);
    }
    catch(Exception e){
      System.err.print(e);
    }

    list.addAll(linkedlist);
    Words w = new Words();
    w.getWords().addAll(list);
    //System.out.print(w.getWords());

    XMLEncoder encoder=null;
		  try{
		     encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("output.xml")));
		  }
      catch(FileNotFoundException fileNotFound){
			System.out.println(fileNotFound);
		}
		encoder.writeObject(w.getWords());
		encoder.close();
  }
}
