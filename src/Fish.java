public class Fish {
    public int size;
    public int weight;
    public void swim(){
        System.out.println("I can swim");
    }
    public void eat(){
        System.out.println("I can eat");
    }
    public static void main(String[] args) {
        Fish f=new Fish();
        f.swim();

    }

}