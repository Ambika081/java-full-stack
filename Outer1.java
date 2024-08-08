  // nested clss

class Outer1{
    int x=100;

   

    class Inner1{
        int y = 10;

        void add(int a){
            a++;
            System.out.println(a);
            System.out.println(x);
        }
    }

    public static void main(String[] args){

        Outer1 o1 = new Outer1();
        Outer1.Inner1 i1 = o1.new Inner1();
        i1.add(200);
    }
}