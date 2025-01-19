public class q5 {
    public static void main(String args[]){
        int n=22;
        int a=0,b=1,sum;
        for(int i=0;i<n;i++){
            if(a<=n){
           System.out.print(a+"\t");
           sum=a+b;
           a=b;
           b=sum;
        }

        }
    }
}
