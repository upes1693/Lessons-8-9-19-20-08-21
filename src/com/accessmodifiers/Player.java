package com.accessmodifiers;

public class Player {
    private int classInteger;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<1){
            System.out.println("Not allowed");
            return;
        }

        this.health=health;
    }

    private int health;

    public Player() {
        this.health = 100;
    }

    public void removeDamage(int damage){
        int secondAnotherInt=0;
        if(damage>0){
            this.health-=damage;
        }
        else{
            System.out.println("Damage must be higher than 0");
        }

        if (health<1){
            System.out.println("Game over!");
        }
    }

    public void addHealth(int health, int bonus){
        int pointToAdd=health+bonus;
        this.health+=pointToAdd;

        int someInteger;
        if(pointToAdd>100){
           someInteger =pointToAdd-50;
        }
        someInteger=10;
    }


}
