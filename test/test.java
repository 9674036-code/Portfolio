package test;

import java.util.HashMap;
import java.util.Scanner;
public class test {
   public static Scanner input = new Scanner(System.in);
   public static String[] consonants= {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z",};
   public static String[] vowels={"a","e","i","o","u"};
   public static int consonantShift = 5;
   public static int vowelShift = 2; 
   public static HashMap<String, Integer> consonantI = new HashMap<>();
   public static HashMap<String, Integer> vowelI = new HashMap<>();


  public static void main (String args[]){
      consonantI.put("b", 1);
      consonantI.put("c", 2);
      consonantI.put("d", 3);
      consonantI.put("f", 4);
      consonantI.put("g", 5);
      consonantI.put("h", 6);
      consonantI.put("j", 7);
      consonantI.put("k", 8);
      consonantI.put("l", 9);
      consonantI.put("m", 10);
      consonantI.put("n", 11);
      consonantI.put("p", 12);
      consonantI.put("q", 13);
      consonantI.put("r", 14);
      consonantI.put("s", 15);
      consonantI.put("t", 16);
      consonantI.put("v", 17);
      consonantI.put("w", 18);
      consonantI.put("x", 19);
      consonantI.put("y", 20);
      consonantI.put("z", 21);
      vowelI.put("a", 1);
      vowelI.put("e", 2);
      vowelI.put("i", 3);
      vowelI.put("o", 4);
      vowelI.put("u", 5);


      System.out.println("Enter your message");
      String message = input.nextLine();
      message = encode(message);
      System.out.println(message);
      System.out.println("Decoded message:");
      System.out.println(decode(message));

  }
  public static String encode(String message){
   for (int i = 0; i<message.length(); i++){
       int shift;
       try{
           if(consonantI.get(message.substring(i,i+1))+consonantShift-1>consonants.length-1){
               shift=consonantI.get(message.substring(i,i+1))+consonantShift-1-consonants.length;
           }else if(consonantI.get(message.substring(i,i+1))+consonantShift-1<0){
               shift=consonantI.get(message.substring(i,i+1))+consonantShift-1+consonants.length;
           }else{
               shift=consonantI.get(message.substring(i,i+1))+consonantShift-1;
           }
           message=message.substring(0,i)+consonants[shift]+message.substring(i+1);
       }catch(Exception e){
           try {
                if(vowelI.get(message.substring(i,i+1))+vowelShift-1>vowels.length-1){
                    shift=vowelI.get(message.substring(i,i+1))+vowelShift-1-vowels.length;
                }else if (vowelI.get(message.substring(i,i+1))+vowelShift-1<0){
                    shift=vowelI.get(message.substring(i,i+1))+vowelShift-1+vowels.length;
                }else{
                    shift=vowelI.get(message.substring(i,i+1))+vowelShift-1;
                }
                message=message.substring(0,i)+vowels[shift]+message.substring(i+1);
           }catch(Exception s){
               try{
                    if(consonantI.get(message.substring(i,i+1).toLowerCase())+consonantShift-1>consonants.length-1){
                        shift=consonantI.get(message.substring(i,i+1).toLowerCase())+consonantShift-1-consonants.length;
                    }else if(consonantI.get(message.substring(i,i+1).toLowerCase())+consonantShift-1<0){
                        shift=consonantI.get(message.substring(i,i+1).toLowerCase())+consonantShift-1+consonants.length;
                    }else{
                        shift=consonantI.get(message.substring(i,i+1).toLowerCase())+consonantShift-1;
                    }
                   message=message.substring(0,i)+consonants[shift].toUpperCase()+message.substring(i+1);
               }catch(Exception w){
                   try{
                        if(vowelI.get(message.substring(i,i+1).toLowerCase())+vowelShift-1>vowels.length-1){
                            shift=vowelI.get(message.substring(i,i+1).toLowerCase())+vowelShift-1-vowels.length;
                        }else if (vowelI.get(message.substring(i,i+1).toLowerCase())+vowelShift-1<0){
                            shift=vowelI.get(message.substring(i,i+1).toLowerCase())+vowelShift-1+vowels.length;
                        }else{
                            shift=vowelI.get(message.substring(i,i+1).toLowerCase())+vowelShift-1;
                        }
                       message=message.substring(0,i)+vowels[shift].toUpperCase()+message.substring(i+1);
                   }catch(Exception a){
                   }
               }
           }


       }
   }
   return message;
  }
  public static String decode(String message){
      consonantShift=-1*consonantShift;
      vowelShift=-1*vowelShift;
      String originalMessage=encode(message);
      consonantShift=-1*consonantShift;
      vowelShift=-1*vowelShift;

      return originalMessage;
  }
}


