class ConstructorDemo{
    
    int value;

    ConstructorDemo(){
         System.out.println("This is the default constructor"); 
    }

    ConstructorDemo(int value){
        System.out.println("This is the parameterized contructor");

        this.value = value;
        System.out.println("The value is set to "+this.value);

    }

    ConstructorDemo(ConstructorDemo c1){
        c1 = new ConstructorDemo();
        System.out.println("This is the copy constructor");
    }

    public static void main (String[] args){
        ConstructorDemo c1 = new ConstructorDemo();
        ConstructorDemo c2 = new ConstructorDemo(5);
        ConstructorDemo c3 = new ConstructorDemo(c1);
    }

}