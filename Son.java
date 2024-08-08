class Father{

    static{
        System.out.println("Name:Abhishek Chavan \n Rno:CS4263 \n Batch:b");

    }
    void job(){
        System.out.println("retd. professor");
 }


    void property(){
        System.out.println("news paper and TV");
    }


    void hobby(){
        System.out.println("a house in native place");

    }
}

    class Son extends Father{
        void job(){
            System.out.println("software developer");
        }

        void property(){
            System.out.println("mobile and internet");

        }
        

        void hobby(){

            System.out.println("a bike through loan");

        }



        public static void main(String[] args) {
            Father f1 = new Father();
            f1.job();
            f1.property();
            f1.hobby();

            Son s1 = new Son();
            s1.job();
            s1.property();
            s1.hobby();

            Father f2 = new Son();
            f2.job();
            f2.property();
            f2.hobby();

        }
    }
