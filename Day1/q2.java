public class q2 {
    public static void main(String args[]){
        int n=78;
        int x=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                x++;
            }
        }
        if(x==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
