public class Main {
    public static void main(String[] args)
    {
        System.out.println("What is number 1?");
        int num1 = 8;
        System.out.println("What is number 2?");
        int num2 = 5;

        if (num1 > num2)
            System.out.println("number 1 is larger, number 2 is smaller");
        else if (num1 == num2)
            System.out.println("number 1 and number 2 are equal");
        else if (num2 > num1)
            System.out.println("number 2 is larger, number 1 is smaller");
        else
            System.out.println("numbers 1 and/or 2 are invalid.");
    }
}