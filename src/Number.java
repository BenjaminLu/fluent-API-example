public class Number
{
    public double number = 0;
    public Number(double number)
    {
        this.number = number;
    }

    public Number add(double targetDouble)
    {
        number += targetDouble;
        return this;
    }

    public Number sub(double targetDouble)
    {
        number -= targetDouble;
        return this;
    }

    public Number mul(double targetDouble)
    {
        number *= targetDouble;
        return this;
    }

    public Number div(double targetDouble)
    {
        number /= targetDouble;
        return this;
    }

    public double getNumber()
    {
        return number;
    }
}
