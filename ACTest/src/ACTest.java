import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;

public class ACTest{
    BigInteger p, q, n, phiN, e, d, m, c;
    final int KEY_SIZE = 1024;
    final BigInteger one;
    final SecureRandom rnd;
    
    public ACTest(){
        e = new BigInteger("65537");
        one = new BigInteger("1");
        rnd = new SecureRandom();
        p = BigInteger.probablePrime(KEY_SIZE/2, rnd);  // generate a prime number f or BigInteger in such format: .probablePrime(int size, SecureRandom rnd)
        q = BigInteger.probablePrime(KEY_SIZE/2, rnd);
        phiN = (p.subtract(one)).multiply(q.subtract(one));   // phi(n) = (p-1)(q-1)
        n = p.multiply(q);  // BigInteger p multiply BidInteger q assign to BigInteger n
        d = e.modInverse(phiN); // get the inverse of e which is d, such that ed = 1 mod phi(n)
        // p.bitLength(): check whether number in BigInt have correct bit length (512-bit)
        System.out.println("p: " + p + "\nq: " + q);
        System.out.println("n: " + n);
        System.out.println("d: " + d);
        
        //  System.out.println();
    }
    
    BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    BigInteger decrypt(BigInteger ciphertext) {
        return ciphertext.modPow(d, n);
    }
    
    public static void main(String [] args){
        ACTest act = new ACTest();
        String m = "This is a shitty text";
        byte [] bytes = m.getBytes();
        BigInteger plaintext = new BigInteger(bytes);
        
        System.out.println("bytes: " + bytes);
        System.out.println("plaintext: " + plaintext);
        
        BigInteger ciphertext = act.encrypt(plaintext);
        
        System.out.println("ciphertext: " + ciphertext);
        
        plaintext = act.decrypt(ciphertext);
        
        System.out.println("plaintext: " + new String(plaintext.toByteArray()));
    }
}