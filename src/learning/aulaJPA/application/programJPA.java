package aulaJPA.application;

import aulaJPA.dominio.PessoaJPA;

public class programJPA {
    public static void main (String[] args){
        PessoaJPA p1 = new PessoaJPA(1, "Carlos da Silva","carlos@gmail.com");
        PessoaJPA p2 = new PessoaJPA(2, "Gilberto Santos","gilsantos@gmail.com");
        PessoaJPA p3 = new PessoaJPA(3, "Katia Ferreira","katiafer@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
