/*
From:
CodingBat code practice
Java > Recursion-1 > changeXY 

Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars. 

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/


public String changeXY(String str) {
  while(str.isEmpty()!=true){
  if (Character.toString(str.charAt(0)).equals("x")){
 
   return ("y"+changeXY(str.substring(1)));
   }
  else{
  return (Character.toString(str.charAt(0))+changeXY(str.substring(1)));
  }

}
  return "";
}
