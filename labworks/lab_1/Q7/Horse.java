interface Animal
{
    //default allows interface to have methods with implementation.
    default void show(){
        System.out.println("This is animal.");
    }
}

class Horse implements Animal
{
    public void move (){
        System.out.println("It runs fast.");
    }

    public void sound(){
        System.out.println("It neighs.");
    }

    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.show();
        h1.move();
        h1.sound();
    }


}