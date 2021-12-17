class Dog extends Animal
{
    String type ;
    Dog (String type){
        super();
        this.type= type;
    }
    void classify(){
        // super();
        System.out.println("type:"+this.type);
    }
    public static void main(String [] args){

        Dog d1 = new Dog("labrador");
        d1.classify();
    }
}