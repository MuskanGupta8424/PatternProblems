public class MirroredRhombus {
    public static void main(String[] args) {
        System.out.println("Mirror Rhombus Star Pattern");
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


