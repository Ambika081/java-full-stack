//static method
//void and return type 

class  teststatic3{

    static void add(int a, int b){
        System.out.println(a+b);
    }

    int sub(int a, int b){
        return a-b;
        }

        public static void main(String[] args){
            teststatic3 t1 = new teststatic3();
            add(12,23);
	    add(5,5);
            t1.add(1,2);
            int result = t1.sub(12,2);
            System.out.println(result);
            System.out.println(t1);
        }
}