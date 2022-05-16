class Main{
    public static void main(String args[]){
        OuterLoop: for(int i=0; i<10; i++){
            System.out.println("");
            if(i==5){
                break;
            }
            for(int j=0; j<5; j++){
                System.out.print("*");
                if(j==i){
                    continue OuterLoop;
                }
            }
        }
    }
}