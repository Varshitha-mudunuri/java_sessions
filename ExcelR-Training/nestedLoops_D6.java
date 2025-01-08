public class nestedLoops_D6 {
    public static void main(String[] args){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }

    }
}


/*array create
default [0,0,0] if not assigned values to integer array..

