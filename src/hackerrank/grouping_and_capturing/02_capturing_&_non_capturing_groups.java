/*
Parenthesis ( ) around a regular expression can group that part of regex together. 
This allows us to apply different quantifiers to that group.

These parenthesis also create a numbered capturing. 
It stores the part of string matched by the part of regex inside parentheses.

These numbered capturing can be used for backreferences. ( We shall learn about it later )

(?: ) can be used to create a non-capturing group. It is useful if we do not need the group to capture its match.

Task

You have a test String S.
Your task is to write a regex which will match S with the following condition:

S should have 3 or more consecutive repetitions of ok.

Note

This is a regex only challenge. You are not required to write a code.
You have to fill the regex pattern in the blank (_________).
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(okokok)");
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}
