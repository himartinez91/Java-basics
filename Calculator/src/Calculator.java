import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by h.m. on 1/22/17.
 */
public class Calculator {


    static Scanner userinput = new Scanner(System.in);
    private int int1;
    private int int2;
    private int operation;
    private int operationChoice;

    public int getOperationChoice() {
        return operationChoice;}

    public void setOperationChoice(int operationChoice) {
        this.operationChoice = operationChoice;}

    public int getOperation() {
        return operation;}

    public void setOperation(int operation) {
        this.operation = operation;}

    public int getInt1() {
        return int1;}

    public void setInt1(int int1) {
        this.int1 = int1;}

    public int getInt2() {
        return int2;}

    public void setInt2(int int2) {
        this.int2 = int2;}

    public Calculator(){
        //int sumOfNumers = 5 + 1;

       // System.out.println("5+1: " + sumOfNumers);

        System.out.print("Enter integer 1: \n");
            if(userinput.hasNextInt()){

               this.setInt1(userinput.nextInt());
                }

        System.out.print("Enter integer 2: \n");
        if(userinput.hasNextInt()){

            this.setInt2(userinput.nextInt());
            }
        System.out.println("enter your operation: ");
        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = /");
        System.out.println("4 = *");

     if(userinput.hasNextInt()){

         this.setOperationChoice(userinput.nextInt());


        // System.out.println("Your equation is = ");
         if(getOperationChoice()== 1){
             System.out.print(getInt1()+ " + ");
             System.out.print(getInt2()+" = ");
             System.out.print(getInt1() + getInt2());}

         if(getOperationChoice()== 2){
             System.out.print(getInt1()+ " - ");
             System.out.print(getInt2()+" = ");
             System.out.println(getInt1() - getInt2());}

         if(getOperationChoice()== 3){
             System.out.print(getInt1()+ " / ");
             System.out.print(getInt2()+" = ");
             System.out.println(getInt1() / getInt2());}

         if(getOperationChoice()== 4){
             System.out.print(getInt1()+ " * ");
             System.out.print(getInt2()+" = ");
             System.out.println(getInt1() * getInt2());}

         if (getOperationChoice()>4){
             System.out.println("Please choose again");
         }
      }


    }
    public static void main(String[] args) {
        Calculator theCalculator = new Calculator();
    }
}
