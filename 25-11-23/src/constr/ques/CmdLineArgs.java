package constr.ques;

public class CmdLineArgs {
    public static void main(String[] args) {
        // command line arguments

        if (args.length>0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else{
            System.out.println("nothing passed");
        }
    }
}
