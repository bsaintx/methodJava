    /**
     * <h1> Calc </h1>
     * 
     * The Calculator performs mathematical operations betweens integers </p>
     * <b> Note: </b> Carefully read the documentation for the class 
     * to enjoy the features offered by the author
     * 
     * @author Bruno Coutinho
     * @version 1.0
     * @since 04/09/2023
    jav */

     public class Calc {
        /**
         * This method is used to sum two integers numbers.
         * @param numberOne this is the first parameter of method
         * @param numberTwo this is the secound parameter of method
         * @return int is the result this method and the sum of two numbers
         */

         public int sum(int numberOne, int numberTwo){
            return numberOne + numberTwo;

      }

      public static void main(String[] args) {
         Calc calculator = new Calc();
         int sumResult = calculator.sum(10, 10);
         System.out.println(sumResult);
      }
   }

   