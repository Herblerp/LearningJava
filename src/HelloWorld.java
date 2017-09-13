public class HelloWorld {
    public static void main(String args[]){

        //Hello world
//-------------------------------------------------------------------------------------
        System.out.println("Hello world!");
//-------------------------------------------------------------------------------------


        //Variables
//-------------------------------------------------------------------------------------
        int myNumber = 5;
        System.out.println(myNumber);

        float myFloat = 5f/3f;
        System.out.println(myFloat);

        double myDouble = 5d/3d;
        System.out.println(myDouble);

        double pi = Math.PI;
        System.out.println(pi);
//-------------------------------------------------------------------------------------


        //Keywords
//-------------------------------------------------------------------------------------
        //The following line will not work because int is a keyword. Find the full list on wikipedia.
        //int int = 5;
//-------------------------------------------------------------------------------------


        //Statemens and expressions
//-------------------------------------------------------------------------------------
        int myVariable = 50; //             "myVariable = 50" is an expression
        System.out.println(myVariable); //  This is a statement, statements end on ";"
//-------------------------------------------------------------------------------------


        //Whitespace
//-------------------------------------------------------------------------------------
        //The compiler ignores whitespace
        int space                                           = 20;
        //However this doesnt work:
        //i    n      t          spa     ce        =       2    0;
//-------------------------------------------------------------------------------------


        //If statements and code blocks
//-------------------------------------------------------------------------------------
        int score = 500;

        if(score<=500||score>500)
        // The following is a code block:
        {
            System.out.println("This will always return true");
        }
//-------------------------------------------------------------------------------------


        //If-else structures
//-------------------------------------------------------------------------------------
        if(score<500){
            System.out.println("This will print if the score is smaaler than 500");
        }
        else if(score>500){
            System.out.println("This will print if the score us bigger than 500");
        }
        else{
            System.out.println("This will print if the above requirements are not met (when the score equals 500)");
        }
//-------------------------------------------------------------------------------------

    }//####################MAIN CLASS ENDS HERE###########################


        //Methods
//-------------------------------------------------------------------------------------
    public static int AddNumbers(int a, int b){

        int result;
        result = a+b;
        return result;//Adds the two given numbers and returns the result
    }
//-------------------------------------------------------------------------------------

    
}
