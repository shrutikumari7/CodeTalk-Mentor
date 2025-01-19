public class q3 {
    public static void main(String args[]){
        int y=2024;
        if((y%4==0 && y%100!=0)||(y%400==0)){
            System.out.println("A leap year");
        }else{
            System.out.println("Not a leap year");
        }        
    }
}
