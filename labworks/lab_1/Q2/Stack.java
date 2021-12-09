class Stack{

    int maxSize = 5;
    int array[] = new int[maxSize];
    int top = -1;

    Stack( int maxSize){

        this.maxSize = maxSize;
    }

    boolean isEmpty(){ 

        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isFull(){

        if(top == maxSize){
            return true;
        }
        else{
            return false;
        }

    }
    void push(int value){

        if(!isFull()){
            top++;
            array[top] = value;
            System.out.println(value+" is pushed.");
            // top++;
        }

    }
    void pop(){

        if(!isEmpty()){
            System.out.println(array[top] + " is popped.");
            array[top] = 0;
            top--;
        }

    }
    
    int  count(){
        return top =1;
    }

    void dispaly(){
        for(int i= 0;i<=top;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){
        Stack s1 = new Stack(5);
        s1.push(12);
        s1.push(23);
        s1.push(50);
        s1.pop();
        s1.dispaly();
    }
}