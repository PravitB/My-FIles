public class multen {
    public static void main(String[] args) {
        int start=20,end=75;
        System.out.println("Multiples of 10 between "+start+" and "+end+": ");
        for(int i=start;i<=end;i++){
            if(i%10==0){
                System.out.print(i +" ");
            }
        }
    }
}
