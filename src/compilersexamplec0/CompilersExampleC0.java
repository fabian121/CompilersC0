/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compilersexamplec0;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Fabian
 */
public class CompilersExampleC0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String programPath = "./src/compilersexamplec0/programa.c";
        String lexerPath = "./src/compilersexamplec0/C-0.jlex";
        
        //GENERATE THE CLASS LEXER
        File file = new File(lexerPath);
        jflex.Main.generate(file);
        
        //GENERATE THE PARSER
        String opciones[] = new String[7]; 
        opciones[0] = "-destdir";
        opciones[1] = "src/compilersexamplec0";
        opciones[2] = "-symbols"; 
        opciones[3] = "sym";
        opciones[4] = "-parser";         
        opciones[5] = "parser"; 

        //Le decimos donde se encuentra el archivo .cup 
        opciones[6] = "src/compilersexamplec0/C-0.cup"; 
        try 
        {
            java_cup.Main.main(opciones);
        } 
        catch (Exception ex)
        {
            System.out.print(ex);
        }
        
        try {
            Yylex lexico = new Yylex(new FileReader("./src/compilersexamplec0/programa.c"));
            parser.nombreFichero = "./src/compilersexamplec0/programa.c";
            new parser(lexico).parse();
        }
        catch (Exception e) {
            System.out.println("...");
        }
    }
    
}
