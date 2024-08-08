public class  Demo{
    public static void main(String[] args){
        
        Thread t1 = new Thread( ()->{
            String java = "java";

            for(int i=0; i<=java.length()-1; i++){
                
            System.out.println(java.charAt(i));
            }

        
        });
            

        Thread t2 = new Thread( ()->{
            String python = "Python";

            for(int i=0; i<=python.length()-1; i++){
                
                System.out.println(python.charAt(i));
                }
       
        });

        t1.start();
        try{
        t2.sleep(1000);
        t2.start();
        }
        catch(InterruptedException  e){
            System.out.println("Error ");

        }
    }
}