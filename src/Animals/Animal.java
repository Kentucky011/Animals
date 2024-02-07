package Animals;

public abstract class Animal {
    private int paws;
    private int eyes;
    public Animal(int paws, int eyes){
        this.paws = paws;
        this.eyes = eyes;
    }
    public int getPaws() {
        return this.paws;
    }
    public int getEyes() {
        return this.eyes;
    }
    public void setPaws(int paws){
        this.paws = paws;
    }
    public void setEyes(int eyes){
        this.eyes = eyes;
    }
    public abstract String walk();
    public abstract String sleep();
    public abstract String say();
    public abstract String eat();
}
