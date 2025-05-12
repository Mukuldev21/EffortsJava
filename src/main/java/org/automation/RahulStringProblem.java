package org.automation;

public class RahulStringProblem {


    public static String ModifyName(String s){

        StringBuilder modifiedName = new StringBuilder();

        int n = s.length();

        for(int i=0; i<n; i++){

            if(i<n-1 && s.charAt(i) == 'a' && s.charAt(i+1) == 'a'){
                modifiedName.append("$$$");
                i++;
            }
            else if(s.charAt(i) == 'a'){
                modifiedName.append("$$");
            }
            else{
                modifiedName.append(s.charAt(i));
            }
        }

        return modifiedName.toString();
    }

    public static void main(String[] args){

        String input = "Raahul Kain";
        String expected = "R$$$hul K$$in";
        String result = ModifyName(input);
        System.out.println("Modified String : " +result);
        System.out.println(result.equals(expected) ? "Test Passed" : "Test Failed");
    }
}
