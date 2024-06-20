import java.math.BigInteger;

public class LatticePaths
{
    public static BigInteger binomialCoefficient(long n, long k)
    {
        BigInteger result = BigInteger.ONE;
        for(int i = 0; i < k; i++) result = result.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        return result;
    }

    public static BigInteger numberOfLatticePaths(long gridSize)
    {
        return binomialCoefficient(2 * gridSize, gridSize);
    }

    public static void main(String[] args)
    {
        System.out.println(numberOfLatticePaths(20000));
    }

}
