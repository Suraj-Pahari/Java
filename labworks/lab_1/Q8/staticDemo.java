class staticDemo{
    static int count;
    staticDemo(){
        count++;
    }
    static void showCount(){
        System.out.println("Total object of staticDemo:"+count);
    }

    public static void main(String [] args){
        staticDemo s1 = new staticDemo();
        staticDemo s2 = new staticDemo();
        staticDemo s3 = new staticDemo();
        staticDemo.showCount();
    }
}