class RightAngleChar{
    public static void main(String[] args){
        
        for(int i=0;i<4;i++){
            for(char c='A';c<='A'+i;c++){
                System.out.print(c+" ");
            }System.out.println();
        }
    }
}