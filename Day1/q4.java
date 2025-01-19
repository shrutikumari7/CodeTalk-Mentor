public class q4 {
    // public static void main(String args[]){
    //     int n=1634,rem,sum=0,a;
    //      a=n;
    //     while(n!=0){
    //          rem=n%10;
    //         sum=sum+(rem*rem*rem);
    //         n=n/10;
    //     }
    //     if(a==sum){
    //         System.out.println("Armstrong number");
    //     }else{
    //         System.out.println("Not armstrong");
    //     }
    // }

    public static void main(String[] args) {
        int a=164,temp,rem,n=0,sum=0;
        temp=a;
        while(temp!=0){
            n+=1;
            temp/=10;
        }
        for(temp=a;temp>0;temp/=10){
            rem=temp%10;
            sum+=Math.pow(rem,n);
        }
        if(sum==a){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
}
