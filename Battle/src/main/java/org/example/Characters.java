package org.example;

public abstract class Characters {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive=true;
    public Characters(String id,String name,int hp,boolean isAlive){
    this.id=id;
    this.name=name;
    this.hp=hp;
    this.isAlive=isAlive;
    }



}
