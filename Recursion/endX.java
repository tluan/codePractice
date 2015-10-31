/*
CodingBat code practice
Java > Recursion-1 > endX 
prev  |  next  |  chance

Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. 

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"From:

*/

public String endX(String str) {
         while ( str.isEmpty()!=true) {

              if ("x".equals(Character.toString(str.charAt(0)))) {

                  return (endX(str.substring(1) )+ "x");
              } else {
                  return (Character.toString(str.charAt(0)) + endX(str.substring(1)));
              }

          }
          return "";
      
     
}
