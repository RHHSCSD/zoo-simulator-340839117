/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.*; 

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] zooAnims = new Animal[10];
        String[] names = new String[]{"Scooby","Shaggy","Daphne","Velma","Fred","Splinter","Donatello","Michelangelo","Raphael","Leonardo"};
        
        char sex;
        boolean randBool;
        int speed;
        int age;
        Image image;
        String species;
        double rand;
        
       for (int i=0;i<zooAnims.length;i++){
           if (Math.random()<0.5){
               sex = 'M';
           }else{
               sex = 'F';
           }
           speed = (int)(Math.random()*10)+1;
           age = (int)(Math.random()*51);
           image = new Image(5,5);
           if (Math.random()<0.5){
               randBool = true;
           }else{
               randBool = false;
           }

           rand = Math.random();
           if (rand<0.3){
               zooAnims[i] = new WaterAnim(names[i], "Fish", sex, speed, age, image, -5, randBool);
           }else if (rand<0.6){
               zooAnims[i] = new BirdAnim(names[i], "Bird", sex, speed, age, image, randBool);
           }else{
               rand = Math.random();
               if (rand<0.3){
                   species = "lion";
               }else if (rand<0.6){
                   species = "Giraffe";
               }else{
                   species = "Monkey";
               }
               zooAnims[i] = new LandAnim(names[i], species, sex, speed, age, image, "ROAR");
           }    
       }
    }
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, int height, boolean canBreathe){
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length+1);
        zooAnims[zooAnims.length-1] = new WaterAnim(name, "Fish", sex, speed, age, image, height, canBreathe);
        return zooAnims;
    }
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, boolean canFly){
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length+1);
        zooAnims[zooAnims.length-1] = new BirdAnim(name, "Bird", sex, speed, age, image, canFly);
        return zooAnims;
    }
    public static Animal[] addAnimal(Animal[] zooAnims, String name, String species, char sex, int speed, int age, Image image){
        zooAnims = Arrays.copyOf(zooAnims, zooAnims.length+1);
        zooAnims[zooAnims.length-1] = new LandAnim(name, species, sex, speed, age, image, "ROAR");
        return zooAnims;
    }
    public static void eat(Animal[] zooAnims){
        for (Animal x:zooAnims){
            if (x.getHunger()>50){
            x.eat();
            }
        }
    }
    public static void sleep(Animal[] zooAnims){
        for (Animal x:zooAnims){
            if (x.getFatigue()>50){
            x.sleep();
            }
        }
    }
    public static void moveAll(Animal[] zooAnims){
        for (Animal x:zooAnims){
            x.move();
        }
    }
    public static String getStats(Animal[] zooAnims){
        int total = zooAnims.length;
        int landAnimal = 0;
        int fish = 0;
        int bird = 0;
        double male = 0;
        double female = 0;
        int speedAvg = 0;
        int ageAvg = 0;
        String species;
                
        for (Animal x:zooAnims){
            species = x.getSpecies();
            if (species.equals("Fish")){
                fish ++;
            }else if (species.equals("Bird")){
                bird++;
            }else{
                landAnimal++;
            }
            if (x.getSex() == 'F'){
                female++;
            }else{
                male++;
            }
            speedAvg += x.getSpeed();
            ageAvg += x.getAge();
        }
        speedAvg = (int)(speedAvg/total);
        ageAvg = (int)(ageAvg/total);
        female = Math.round(((female/total)*100.0)*100.0)/100.0;
        male = Math.round(((male/total)*100.0)*100.0)/100.0;
        
        return "There are "+total+" total animals in the Zoo\nThe average speed of all animals is "+speedAvg+"\nThe average age of all animals is "+ageAvg+"\nThe zoo is "+male+"% male and "+female+"% female\nThere are "+bird+" birds, "+fish+" fish, and "+landAnimal+" land animals";
    }
}
