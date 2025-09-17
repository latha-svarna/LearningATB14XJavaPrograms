package ex_03_Literals;

public class Lab003_Char_Literal {
    public static void main(String[] args) {

        char c='A';
        //Escape sequence

        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';
        System.out.println("Swarna latha");
        System.out.println("Swarna"+new_line+"latha");
        System.out.println("Swarna\nlatha");
        System.out.println("Swarna"+tab_line+"latha");
        System.out.println("Swarna"+back_space+"latha");
        char rupee='$';
        System.out.println(rupee);
         char my_laugh_smily='\u1f60';
        System.out.println(my_laugh_smily);
    }
}
