public class Cinema {


    public static void main(String[] args) {

        System.out.println("Cinema:");
        for(int row =1; row<9; row++){
            System.out.print(" "+row);
        }

        System.out.println();
        for(int col =1; col<=7; col++){
            System.out.print(col);
            for(int row =1; row<9; row++){
                System.out.print(" S");
            }
            System.out.println();
        }

    }
}
