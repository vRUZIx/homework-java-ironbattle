package org.example;

public class Warriors extends Characters {
    private int stamina;
    private int strength;
    public Warriors(String name,int hp,int stamina,int strength){
        super(id,name,hp,isAlive);
        this.stamina=stamina;
        this.strength=strength;
    }
}
