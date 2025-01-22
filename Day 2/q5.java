public class q5 {
    public static void main(String[] args) {
        int num=1221,temp,sum=0,rem;
        temp=num;
        for(int i=1;i<=num;num/=10){
            rem=num%10;
            sum=(sum*10)+rem;
        }
        if(temp==sum){
            System.out.println("The number "+temp +" is palindrome");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
