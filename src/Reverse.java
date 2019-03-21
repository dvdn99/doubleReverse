/*
double reverse algorithm
in order to reverse word order

@author: David Novizky
:)

 */


import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        char word[];

        System.out.println("Enter Your Sentence: ");
        input = sc.nextLine();

        word = input.toCharArray();

        doubleReverse(word);

        System.out.println(word);

    }

    public static void reverse(char[] word, int i, int j){
        char ch;
        int length = i + j;

        while(i < length/2 + 1){
            ch = word[i];
            word[i] = word[j];
            word[j]=ch;
            i++;
            j--;
        }
    }


    public static void doubleReverse(char[] word){
        int length = word.length;

        reverse(word,0,length-1);

        for(int i = 0; i < length ; i++){
            if(word[i] != ' ') {
                for (int j = i; j < length; j++) {
                    if(word[j] == ' '){
                        reverse(word,i,j-1);
                        i = j;
                        break;
                    }else if(j == length - 1){
                        reverse(word,i,j);
                        i = j;
                    }
                }
            }
        }

    }
}
