/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobebidas;

/**
 *
 * @author SATC
 */
public enum Bebidas {
    
    a1("Coca-Cola","Refrigerante",600,  6.00),
    a2("Cerveja Skol","Cerveja",1000, 10.00),
    a3("Absolut","Vodka",1000,120.00),
    a4("Corote","Cachaça",500,3.00),
    a5("Suco de laranja","Suco",2000,10.00),
    a6("Todynho","Achocolatado",350,1.50),
    a7("Agua","Liquido saudavel",600,2.00),
    a8("Agua de coco","Agua",500, 5.00),
    a9("Cerveja Subzero","Cerveja",1000,10.00),
    a10("Intension","Vodka",1000,75.00);
    
    private String nome;
    private String descricao;
    private int ml;
    private double valor;

    private Bebidas(String nome, String descricao, int ml, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.ml = ml;
        this.valor = valor;
    }

    
   

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getMl() {
        return ml;
    }

    public float getValor() {
        return (float) valor;
    }

    @Override
    public String toString() {
        return "\n"+this.getNome()+this.getDescricao()+this.getMl()+this.getValor();
    }

    
}
