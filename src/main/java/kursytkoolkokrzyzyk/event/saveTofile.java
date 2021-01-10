package kursytkoolkokrzyzyk.event;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class saveTofile {
// zrobic zapis imienia do pliku, i do bazy danych pozniej, tu i tu.
        public static void main(String[] args) throws FileNotFoundException{
            PrintWriter zapis = new PrintWriter("ala.txt");
            zapis.println("Ala ma kota, a kot ma Alę");
            zapis.close();
        }
    }


