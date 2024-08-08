// methods can be overiden but not attributes

class Mother{
    int age=45;

    void job(){
        System.out.println("Working in IT sector");
    }

    void hobby(){
        System.out.println("Listeninig Songs");
    }

    void property(){
        System.out.println("a flat in aurangabad");   
    }
}

class Daughter extends Mother{
    int age = 21;

    void job(){
        System.out.println("Working in software sector");
    }

    public void property(){
        System.out.println("a bike thru bank loan");
    }

    public static void main(String[] args){

        Mother m1 = new Mother();
        m1.job();
        m1.property();
        m1.hobby();

        Daughter d1 = new Daughter();
        d1.job();
        d1.property();
        d1.hobby();

        Mother m2 = new Daughter();
        System.out.println(m2.age);
        m2.job();
    }
}