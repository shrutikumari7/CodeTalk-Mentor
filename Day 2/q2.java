public class q2 {
    public static void main(String args[]){
         int num=111,sum=0,rem;
           
           for(int i=1;i<=num;num/=10){
            rem=num%10;
            sum+=rem;
           }
           System.out.println(sum);
    }  
}
