package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File formulario = new File("C:/documents/formulario.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(formulario))){

            for(String linha = br.readLine(); linha != null; linha = br.readLine()){
                System.out.println(linha);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}
