package MichaelRaineri;

import java.util.HashMap;

public class FrequencyAnalysis {
    HashMap<Character,Double> normEngLetterFrequency= new HashMap<Character, Double>();
    HashMap<Character,Integer> letterFrequency= new HashMap<Character, Integer>();
    String freAnaText;

    public FrequencyAnalysis(String text){
        freAnaText = text;
        char[] textArray =text.toCharArray();
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        //Creates the template for Frequency Analysis
        for (int i = 0; i<alphabet.length; i++){
            letterFrequency.put(alphabet[i],  0);
        }

        //Calculate Frequency
        for (char character: letterFrequency.keySet()){
            int counter = 0;

            for (char letter : textArray){
                if (letter == character){
                    counter++;
                    letterFrequency.put(character,counter);
                }
            }
        }

        //print out Letter Frequency
        for (char character : letterFrequency.keySet()){
            System.out.print(character + ":" + letterFrequency.get(character) + " , ");
        }

        System.out.println();


        //prints out letter frequency as a percentage
        String result;
        double percent;
        for (char character : letterFrequency.keySet()){
            percent = (double) letterFrequency.get(character) / textArray.length * 100;
            result = String.format("%.2f", percent);
            System.out.print(character + ":" + result + "% , ");
        }


        //Create normal english letter frequency
        //HashMap<Character,Double> normEngLetterFrequency= new HashMap<Character, Double>();
        normEngLetterFrequency.put('A', 8.2);
        normEngLetterFrequency.put('B', 1.5);
        normEngLetterFrequency.put('C', 2.8);
        normEngLetterFrequency.put('D', 4.3);
        normEngLetterFrequency.put('E', 12.7);
        normEngLetterFrequency.put('F', 2.2);
        normEngLetterFrequency.put('G', 2.0);
        normEngLetterFrequency.put('H', 6.1);
        normEngLetterFrequency.put('I', 7.0);
        normEngLetterFrequency.put('J', 0.2);
        normEngLetterFrequency.put('K', 0.8);
        normEngLetterFrequency.put('L', 4.0);
        normEngLetterFrequency.put('M', 2.4);
        normEngLetterFrequency.put('N', 6.7);
        normEngLetterFrequency.put('O', 7.5);
        normEngLetterFrequency.put('P', 1.9);
        normEngLetterFrequency.put('Q', 0.1);
        normEngLetterFrequency.put('R', 6.0);
        normEngLetterFrequency.put('S', 6.3);
        normEngLetterFrequency.put('T', 9.1);
        normEngLetterFrequency.put('U', 2.8);
        normEngLetterFrequency.put('V', 1.0);
        normEngLetterFrequency.put('W', 2.4);
        normEngLetterFrequency.put('X', 0.2);
        normEngLetterFrequency.put('Y', 2.0);
        normEngLetterFrequency.put('Z', 0.1);


    }

    public void getEnglishLetterFreq() {
        for (char character : normEngLetterFrequency.keySet()) {
            System.out.print(character + ":" + normEngLetterFrequency.get(character) + "% , ");
        }
    }

    public void frequencyAtX(int keySize, int letterNumber){
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] textArray =freAnaText.toCharArray();
        HashMap<Character,Integer> letterFrequencyPerc= new HashMap<Character, Integer>();
        int totalLettersatX = 0;

        //Creates the template for Frequency Analysis
        for (int i = 0; i<alphabet.length; i++){
            letterFrequencyPerc.put(alphabet[i],  0);
        }



        int counter = 0;
        int count = 0;
        int letternum = letterNumber;
        int aplhaFrequency;

        //iterate though cipher
        for (int i = 0; i <textArray.length; i++){

            // start from letterNumber
            if ( i > letterNumber) {

                //Count every nth number
                if (i % keySize == 0 ){

                    //Adds Frequency
                    aplhaFrequency = letterFrequencyPerc.get(textArray[i]) + 1 ;
                    letterFrequencyPerc.put(textArray[i],aplhaFrequency );
                    counter = 0;
                    totalLettersatX ++;
                }

                else {
                    counter++;
                }

            }
            else{
                letternum++;
            }

        }




        int totalFreq = 0;
        for (char character: letterFrequencyPerc.keySet()){
            totalFreq += letterFrequencyPerc.get(character);

        }

        //Print
        String result;
        double percent;
        for (char character : letterFrequencyPerc.keySet()){
            percent = (double) letterFrequencyPerc.get(character) / totalFreq * 100;
            result = String.format("%.2f", percent);
            System.out.print(character + ":" + result + "% , ");
        }


    }


}
