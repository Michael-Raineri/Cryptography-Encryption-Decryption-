package MichaelRaineri;

import java.util.ArrayList;

public class CaesarCipher {
    String plainText;
    String cipher;
    String key;
    int shiftNo;


    public CaesarCipher() {
    }

    public static void main(String[] args) {

        int shiftNo = 0;
        String q1 = "MNXXNLMYMJMFITGANTZXQDSTYINXHJWSJIMJWDJYNSMJWUTXNYNTSFLFNSXYYMJXZSGZYYMJRTRJSYYMFYXMJRTAJIFLFNSMJWJHTLSNEJIMJWYMJJKKJHYZUTSMJWTQIQTAJWBFXJQJHYWNHKFWXYWTSLJWYMFSYMJJKKJHYTKMNXUWJXJSHJZUTSMJWMNXKNWJYMJYZRZQYZTZXWNSLTKMNXJQTVZJSHJXJJRJIYTLTTZYTKMNRMNXQNUXYWZLLQJIFSIYWJRGQJIZSIJWYMJBTWIXYMFYQFDZUTSNYGZYIJQNAJWYMJRNYHTZQISTYFXQTSLFXXMJKFHJIMNRMNXJDJXFKYJWYMJNWKNWXYLQFSHJZUTSMJWKFHJMZSLHTSKZXJIQDNSJAJWDTYMJWINWJHYNTSGZYMJWXGZYHFRJGFHPNSFIJXUJWFYJQJFUJAJWDKJBXJHTSIXYMNXUFWFQDXNXQFXYJIMTBJAJWGZYFXMTWYYNRJKTWYJXXXJSJWLNJXWJYZWSJIBNYMYMJFYWTUMDTKMNXFSIXMJBFQPJIFXKFXYFXXMJBFXFGQJUFXYYMJGFWSFSITSBFWIFXXTTSFXXMJHTZQIWJKQJHYNYFUUFQQJIMJWYMNXHMFSLJNSYMJNWWJQFYNAJUQFYKTWRXMJBMTMFIBWTZLMYMJWZSITNSLBFXSTBTSYMJXNIJTKYMJXUNWNYBMNQJXMJWJRFNSJIZSWJLJSJWFYJFSIFXNSYMJQJLJSINYMFIWJXZQYJIYMFYMJWHDUWNFSNRFLJMFIXZIIJSQDFUUJFWJIZUTSMNXFQYFWBMJWJGDYMJKNWJTKY";
        String q1Snippet = "MNXXNLMYMJMFITGANTZXQDSTYINXHJWSJIMJWDJYNSMJWUTXNYNTSFLFNSXYYMJXZSGZ";
        String cipher= q1Snippet.toLowerCase();
        char[] characters = cipher.toCharArray();


        System.out.println(cipher);


        for (int shift = 0; shift < 26; shift++) {
            System.out.print("Shift No. " + shift + ": ");


            // make sure alphabet loops
            for (char alp: characters){
                char c = (char) (alp - shift);
                if(c < 'a'){
                    alp = (char) (c + 26);
                    System.out.print(alp);
                }
                else {
                    alp -= shift;
                    System.out.print(alp);
                }
            }
            System.out.println();
        }



    }
    public static void ceasarDecrypt(String cipherText, int shiftNo){
        String cipher= cipherText.toLowerCase();
        char[] characters = cipher.toCharArray();
        for (int shift = 0; shift < 26; shift++) {
            System.out.print("Shift No. " + shift + ": ");


            // make sure alphabet loops
            for (char alp: characters){
                char c = (char) (alp - shift);
                if (c < 'a'){
                    alp = (char) (c + 26);
                    System.out.print(alp);
                }
                else {
                    alp -= shift;
                    System.out.print(alp);
                }
            }
            System.out.println();
        }
    }
}
