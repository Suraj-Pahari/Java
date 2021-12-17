interface Herbivore{

    default void print(){
        System.out.println("Eats plant.");
    }

}

interface Carnivore{

    default void print(){
        System.out.println("Eats animal.");
    }

}

class Omnivore implements Herbivore ,Carnivore{

    public void print(){
        Herbivore.super.print();
        Carnivore.super.print();
    }
    
    public static void main(String [] args){
        Omnivore o1 = new Omnivore();
        o1.print();
    }
}