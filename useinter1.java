    // by defualt all methods in an interface is public abstract
    // methods can have body till jdk 8
    // one interface can exteds another interface 
    // the class implements the interface must override the methods int he interfaace 
    // a class can implement multiple interfaces 
 interface inter1{

    void add(int a);
}

interface inter2 extends inter1{

    void sub(int a, int b);
}

class useinter1 implements inter2{
public void add(int a){
    a++;
    System.out.println(a);
}
public void sub(int a, int b){
System.out.println(a-b);
}


public static void main(String[] args){
    inter1 i1 = new useinter1();
    i1.add(1);

    inter2 i2 = new useinter1();
    i2.sub(12,3);

    useinter1 i3 = new useinter1();
    i3.add(2);
    i3.sub(12,2);
}
}