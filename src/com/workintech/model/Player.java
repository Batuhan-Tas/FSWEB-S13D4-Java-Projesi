package com.workintech.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){

        if(healthPercentage >100){
            this.healthPercentage = 100;
        } else if(healthPercentage <100){
            this.healthPercentage = 0;
        } else{
            this.healthPercentage = healthPercentage;
        }

        this.name = name;

        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public int loseHealth(int damage){
       if(healthPercentage>0){
           if(damage>0){
               healthPercentage = healthPercentage - damage;
               if(healthPercentage<=0){
                   System.out.println(name + " player has been knocked out of game");
                   healthPercentage = 0;
               }
           }
       } else if(healthPercentage<=0){
           System.out.println(name + " player has been knocked out of game");
           healthPercentage = 0;
       }
       return healthPercentage;
    }

    public int restoreHealth(int healthPotion){
        if(healthPercentage>=100){
            healthPercentage = 100;
        } else if(healthPercentage+healthPotion >100) {
            healthPercentage = 100;
        } else if(healthPercentage + healthPotion <= 100){
            healthPercentage = healthPercentage + healthPotion;
        }
        return healthPercentage;
    }

    public String toString(){
        return "Name: " + name + " - Health Percentage: " + healthPercentage + " - Weapon: " + (Weapon.BOW);
    }

}
