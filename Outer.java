// nested clss

class Outer{
    int x=100;


    class Inner{
        int y = 10;

        void add(int a){
            a++;
            System.out.println(a);
            System.out.println(x);
        }
    }

    public static void main(String[] args){

        Outer o1 = new Outer();
        o1.createInner();
    }
}