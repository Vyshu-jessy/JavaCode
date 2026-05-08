class Array{
    public static void main(String args[]){
       int a[][][]=new int[3][3][3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
            a[i][j][k]=(int)(Math.random()*10);

        }}
       }
       for(int r[][]:a){
        for(int s[]:r){
            for(int c:s){
            System.out.print(c+" ");
        }
        System.out.println();
       }
   }
}
}