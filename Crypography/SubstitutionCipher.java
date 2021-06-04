package MichaelRaineri;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SubstitutionCipher
{

    public static void main(String[] args) {
        String q7Cipher = "GBZBSAIBWHZYBKJCHZNEZGFKHBZGBZGFIZGBCIZNJHZGAKZFYMKZRJHZHGBVZGFIZEFCCBWZFLFAWZHNZGAKZKAIBZENYZKGBZGFIZWNHZXNMBZENYPFYIZYBMFAWAWLZKHACCZAWZHGBZNQBWAWLZNEZHGBZINNYPFVZMBYBZVBCCNPZKUBCBHNWZHGFHZGBZPFKZWNPZGBZEBCHZHGBZXNWHYFKHZRBHPBBWZHGBMZFWIZHGNJLGHZGAKZFQQBFYFWXBZIAKHFKHBEJCZHNZGBYZHBKKZGBZKFAIZGJKUACVZXFWZVNJZENYLASBZMBZENYZLNAWLZFPFVZXFWHZVNJZXNMBZHNZMBZGNPZINZVNJZLBHZHNZRBZCAUBZHGAKZAHZAKZHNNZCFHBZKFAIZKGBZGBYZSNAXBZKNJWIAWLZGFYIZHGYNJLGZHGBZYNNMZGBYZBVBKZKGAWAWLZJWWFHJYFCCVZAZIAIZWNHZHGAWUZYALGHCVZNEZVNJZAZIAIZWNHZKBBZVNJZFKZVNJZPBYBZGBZXNWHAWJBIZHNZQCBFIZAZGFSBZCBFYWHZHNZKAWXBZIBFYBKHZHBKKVZMAWBZHNNZCFHBZHNNZCFHBZKGBZKFAIZPFSAWLZGBYZGFWIZAWZHGBZAMQFHABWXBZNEZFZQBYKNWZPGNKBZHNYHJYBKZXFJKBZBSBYVZAWKHFWHZHNZKBBMZFWZGNJYZINWHZXNMBZXCNKBZHNZMBZFWLBCZWNZVNJZMJKHZWNHZUBBQZFPFVZRJHZINWHZVNJZCNSBZMBZMVZIBFYZPAEBZRBXFJKBZAZGFSBZRBBWZK";
        char[] q7CipherA =q7Cipher.toCharArray();
        String keyString = "FRXIBELGADUCMWNQOYKHJSPTVZ";
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', '|'};
        char[] key = keyString.toCharArray();
        HashMap<Character,Character> decryptKey = new HashMap<Character, Character>();
        String result = "";

        System.out.println(key);
        System.out.println(alphabet);

        //Creates the relation between key and alphabet
        for (int i = 0; i<key.length; i++){
            decryptKey.put(key[i], alphabet[i]);
        }

        //deciphers to plaintext
        for (char q7CipherChars: q7CipherA){
            result += decryptKey.get(q7CipherChars);

        }
        System.out.println(result);







    }

    //generates key - not used
    public static ArrayList<String> generateKey(){
        char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<String> alpha = new ArrayList<String>();
        int min = 0;
        int max = alphabet.length;


        //Create alaphabet
        for (int i = 0 ; i < alphabet.length; i++){
            alpha.add(String.valueOf(alphabet[i]));

        }
/*

        System.out.println("max " + max);
        System.out.println(random2);

        System.out.println("ALPHA BEFORE: " + alpha);

*/

        while (alpha.size() != 0){
            max = alpha.size()-1;
            int random = (int) (Math.random() * (max - min +1) + min);


            key.add(alpha.get(random));
            alpha.remove(random);

        }
        return key;
    }




}