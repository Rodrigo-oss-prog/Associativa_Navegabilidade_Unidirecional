/*

Implemente a associação entre classes usando ArrayList.
Imprimir autor de um determinado livro.

 */

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Livros e Edições");
        Scanner scanner = new Scanner(System.in);


        Editora editora1 = new Editora("Boitempo", "11.458.690/000");
        Editora editora2= new Editora("Cosa Nostrs", "12.458.990/000");
        Editora editora3 = new Editora("Sol Nascente", "15.558.658/001");


        Autor autor1 = new Autor("Deivison Nkosi", "16 98133-87330");
        Autor autor2 = new Autor("Racionais mc's","11 98533-7896" );
        Autor autor3 = new Autor("Isablle Christ", "55 99785-3365");
        Autor autor4 = new Autor("Walter Lippold", "11 98765-1254");


        Livro livro1 = new Livro(editora1,"Colonialismo Digital: Por uma crítica hacker-fanoniana",
                2022, 60);
        Livro livro2 = new Livro(editora2,"Sobrevivendo no Inferno", 2018, 65);
        Livro livro3 = new Livro(editora3,"Maria não vai com as outras", 2019, 55 );
        Livro livro4 = new Livro(editora1,"Assim Falou Fanon", 2020, 55);

        livro1.addAutor(autor1, autor4);
        livro2.addAutor(autor2);
        livro3.addAutor(autor3);
        livro4.addAutor(autor4);



        System.out.println("Digite o titulo do livro que deseja saber o autor ou autores: ");
        String titulo = scanner.nextLine().toLowerCase().trim();
        if(livro1.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
           for (Autor autor : livro1.getAutores()){
               System.out.println("Autor: " + autor.getNome());
           }
            System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
        } else if (livro2.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
            for (Autor autor : livro2.getAutores()){
                System.out.println("Autor: " + autor2.getNome());
            }
            System.out.println("Ano de Publicação: " + livro2.getAnoPublicacao());

        } else if (livro3.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
            for (Autor autor: livro2.getAutores()){
                System.out.println("Autor: " + autor3.getNome());
            }
            System.out.println("Ano de Publicação: " + livro3.getAnoPublicacao());

        } else if (livro4.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
            for (Autor autor : livro4.getAutores()){
                System.out.println("Autor: " + autor4.getNome());
            }
            System.out.println("Ano de Publicação: " + livro4.getAnoPublicacao());

        }else
            System.out.println("Título e autor não cadastrado!");

        scanner.close();
    }
}