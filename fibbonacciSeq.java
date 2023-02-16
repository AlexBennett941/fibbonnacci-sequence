public class fibbonacciSeq {
    
    public static void main(String[] args){
        //arg and initial fib numbers
        int firstArg;
        int n1 = 0;
        int n2 = 1;
        int n3;
        
        //checking for arguments
        if (args.length > 0){
            try{
                //change str to int
                firstArg = Integer.parseInt(args[0]);
                //calculating fib number
                for (int i = 2; i <= firstArg ; i++){
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }
                System.out.println(n2);
            }
            catch (NumberFormatException e){
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}
