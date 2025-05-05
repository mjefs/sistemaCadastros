package entities;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    private String sexo;
    private String tipo;
    private Integer idade;
    private Double peso;
    private String raca;

    private List<Endereco> enderecos = new ArrayList<>();

    public Animal(){

    }

    public Animal(String nome, String sexo, String tipo, Integer idade, Double peso, String raca) {
        this.nome = nome;
        this.sexo = sexo;
        this.tipo = tipo;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }


}
