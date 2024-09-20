public class EratosthenesPrimeSieve implements PrimeSieve{

    public int ceiling = 501;
    Boolean[] ceilingList = new Boolean[ceiling];

    @Override
    public boolean isPrime(int p) {

       return false;
    }

    @Override
    public void printPrimes() {

        for (int i = 1; i < ceiling; i++) {
            ceilingList[i] = true;
        }

        checkIfPrime();
        for (int i = 2; i < ceiling; i++) {
            if (ceilingList[i] == true)
            {
                System.out.print(i + " ");
            }
        }

    }

    public void checkIfPrime()
    {
        for (int i = 2; i < ceilingList.length; i++) {
            if (ceilingList[i] != false) {
                int deleatIndex = i * i;
                while (deleatIndex < ceiling) {
                    ceilingList[deleatIndex] = false;
                    deleatIndex = deleatIndex + i;
                }
            }
        }
    }
}
