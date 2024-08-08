class Testcall1{
    public static void main(String[] args){
    
            try{
                Runtime r = Runtime.getRuntime();
                Process p1 = r.exec("calc");
                Process p2 = r.exec("notepad");
    
            }catch(Exception e){
                System.out.println("Error calling other appp");
        }
    }
}