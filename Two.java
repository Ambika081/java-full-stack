package sspack;

class Two{
    void add(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args){
        Two o1 = new Two();
        o1.add(1);
    }
}