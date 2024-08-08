public class Threadgroup1{
    public static void main(String[] args){
        Thread t1 = Thread.currentThread();
        ThreadGroup tg1 = t1.getThreadGroup();

        System.out.println("Current threads name:"+t1.getName());
        System.out.println("Current threada group name:"+ tg1.getName());

        Thread t2 = new Thread("My new thread");

        ThreadGroup tg2  = t2.getThreadGroup();
        System.out.println("New Threads name:"+t2.getName());
        System.out.println("New thread group name:"+tg2.getName());
    }
}