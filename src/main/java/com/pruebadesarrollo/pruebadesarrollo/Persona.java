package com.pruebadesarrollo.pruebadesarrollo;

public class Persona {

    private String name;
    private String saludo;
    private String despedida;
    private String miNombre;

    public Persona(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getDespedida() {
        return despedida;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    public String getMiNombre() {
        return miNombre;
    }

    public void setMiNombre(String miNombre) {
        this.miNombre = miNombre;
    }
}
