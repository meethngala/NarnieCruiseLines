/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narnia.cruise.lines;

/**
 *
 * @author Meeth
 */
public class WriteFiles {
    
  public  void writeFile(String filepath, String outputString) throws Exception {
    java.io.File file = new java.io.File(filepath);
    if (file.exists()) {
      System.out.println("File already exists");
      
    }

    // Create a file
    java.io.PrintWriter output = new java.io.PrintWriter(file);

    // Write formatted output to the file
    output.print(outputString);
    

    // Close the file
    output.close();
  }
}

