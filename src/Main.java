public class Main
{
    public static void main(String[] args)
    {
        Number number = new Number(5);
        double answer = number.add(5).sub(1).div(3).mul(15).getNumber();
        System.out.println(answer);
    }
}
