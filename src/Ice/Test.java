/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ice;

/**
 *
 * @author anish
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(iterations('a', "Raman"));
        System.out.println(occurrence('a', 'n', "Raman"));
        System.out.println(specifications('a', "Raman"));

    }

    public static int iterations(char letter, String word) {
        int sum = 0;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == letter) {
                sum++;

            }
        }
        return sum;
    }

    public static char occurrence(char firstLetter, char secondLetter, String word) {

        char letter = '$';
        int firstNum = 0;
        int secondNum = 0;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == firstLetter) {

                firstNum++;

            } else if (c == secondLetter) {
                secondNum++;

            }
        }

        if (firstNum > secondNum) {

            letter = firstLetter;
        } else if (secondNum > firstNum) {

            letter = secondLetter;
        }
        return letter;

    }

    public static boolean specifications(char letter, String word) {

        boolean exist = false;
        char[] arr = word.toCharArray();
        for (char c : arr) {
            if (c == letter) {
                exist = true;
            }
        }
        return exist;
    }

}
