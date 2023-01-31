public class reto0{
    public static void main(String []args){
        int i;
        for(i = 1; i < 101; i++){
            if(divisible3(i) == true && divisible5(i) == true){
                System.out.println("fizzbuzz");
            }else if(divisible3(i) == true){
                System.out.println("fizz");
            }else if(divisible5(i) == true){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static boolean divisible3(int num){
        boolean flag = false;
        if(num%3==0){
            flag = true;
        }
        return flag;
    }
    
    public static boolean divisible5(int num){
        boolean flag = false;
        if(num%5==0){
            flag = true;
        }
        return flag;
    }
}