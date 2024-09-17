public class EratosthenesPrimeSieve implements PrimeSieve{

    public int ceiling = 500;
    Boolean[] ceilingList = new Boolean[500];

    public void checkIfNumberIsPrime()
    {
        int counter = 0;
        int primeCounter = 2;

        while(counter != ceiling)
        {
            if (counter % primeCounter)
            {
                ceilingList[counter] = true;
            }else
            {
                primeCounter++;
            }
        }
    }

    @Override
    public boolean isPrime(int p) {

        int counter = 0;
        for (Boolean b : ceilingList) {
            if(counter == p)
            {
                return true;
            }
            counter++;
        }
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
