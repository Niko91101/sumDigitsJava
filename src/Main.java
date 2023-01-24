public class Main
{
    public static void main(String[] args)
    {
//        Container container = new Container();
//        container.count += 7843;
        System.out.println(sumDigits(10002));
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }



}
