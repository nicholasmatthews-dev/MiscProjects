/* Psuedocode:
 * FOR Every line in text:
 *      Convert to lower case
 *      Read each character
 *      FOR Each character
 *           If character is a letter
 *                Add to letter count for that letter
 * Tally total letters
 * Divide each letter count by total
 * Display bar graph with normalized values
 * 
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class NicholasMatthews_03 {

    static final String LETTERS_IN_THE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int    FIRST_LETTER            = 'a';
    static final String FILE_NAME               = "GreenEggsAndHam.txt";
    static final int    FRAME_WIDTH             = 1024;
    static final int    FRAME_HEIGHT            = 768;

    public static void main(String[] args) throws FileNotFoundException {
        //Initializes all variables
        String[] lettersLabels = new String[26];
        double[] lettersFrequency = new double[26];
        String currentLine = "";
        double totalLength = 0;
        int charVal = 0;
        
        
        //Initialize both arrays with the default values
        for (int i = 0; i < 26; i++) {
        	lettersLabels[i] = LETTERS_IN_THE_ALPHABET.substring(i, i+1);
        	lettersFrequency[i] = 0;
        }



        
        /* Gets the path of the directory for this java project and then adds
         * the name of the file to be opened at the end with the prefix "\"
         * After the path is created, it is fed into the file class which
         * is put into a scanner so that the document can be read.
         */
        String path = System.getProperty("user.dir");
        path = path.concat("\\"+FILE_NAME);
        File inputFile = new File(path);
        Scanner scan = new Scanner(inputFile);
        
        //Reads through the document and tallies the occurence of each letter of the alphabet
        while (scan.hasNext()) {
        	//Scans each line into a temporary variable
        	currentLine = scan.nextLine();
        	currentLine.toLowerCase();
        	
        	/* Checks each character to see if its value is in the range of 97-122,
        	 * if the character is in this range it is part of the 26 letters of the alphabet.
        	 * Then the value 97 is subtracted to normalize the character value to fit in the range
        	 * of our array of frequencies, then it is used as an index and the frequency for that letter
        	 * is incremented by 1 along with the total count of letters.
        	 */
        	for (int i = 0; i < currentLine.length(); i++) {
        		charVal = (int)currentLine.charAt(i);
        		if (charVal>=97&&charVal<=122) {
        			lettersFrequency[charVal-97] += 1;
        			totalLength += 1;
        		}
        	}
        }
        
        //Closes out the scanner
        scan.close();
        
        //Converts the tallied numbers into their relative percentages instead of their absolute values
        for (int i = 0; i < 26; i++) {
        	lettersFrequency[i] = lettersFrequency[i]/totalLength;
        }
        
        //Inherited code from LetterDistributionTemplate which sets up the actual bar chart and displays it.
         JFrame f = new JFrame();
         f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
         String title = FILE_NAME.split("\\.")[0];

         BarChart chart = new BarChart(title, lettersLabels, lettersFrequency);
         f.getContentPane().add(chart);

         WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }
}