public class Test{
    public static void main(String[] args){

        int num = 5;

        boolean isPrime = true;


        if(num<2){
            isPrime = false;
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "Prime": "Not prime";
        System.out.println(result);
}
}