package homework6;

public class Animal {
    protected String name;
    protected String species;
    protected int runLength;
    protected int swimLength;
    protected double jumpHeight;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int length) {
        if (this.runLength >= length) {
            System.out.println(species + " " + name + " бегает до " + length + " метров");
        } else {
            System.out.println(this.species + " " + this.name + " не может бегать на такое расстояние");
        }
    }

    public void swim(int length) {
        if (this.swimLength >= length) {
            System.out.println(species + " " + name + " плавает до " + length + " метров");
        } else {
            System.out.println(this.species + " " + this.name + " не может плавать на такое расстояние");
        }
    }

    public void jump(double height) {
        if (this.jumpHeight >= height) {
            System.out.println(species + " " + name + " прыгает до " + height + " метров");
        } else {
            System.out.println(this.species + " " + this.name + " не может прыгать на такую высоту");
        }
    }

    public void overall() {
        if (this.swimLength> 0) {
            System.out.println(this.species + " " + name + " бегает на расстояние " + this.runLength + " метров, плавает на расстояние " + this.swimLength + " метров и прыгает на высоту " + this.jumpHeight + " метров");
        }
        else {
            System.out.println(this.species + " " + name + " бегает на расстояние " + this.runLength + " метров, не плавает, и прыгает на высоту " + this.jumpHeight + " метров");
        }
    }
}

