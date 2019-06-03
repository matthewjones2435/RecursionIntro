package edu.cnm.deepdive;

public class Palindrome {
  public static boolean isPalindrome(String s){
    s = s.toLowerCase().replaceAll("[\\s;\\-?.,!]+", "");
    return s.equals(new StringBuilder(s).reverse().toString());
  }

  public static void main(String[] args) {
    boolean result = isPalindrome("A man, a plan, a canal, -Panama!");
    System.out.println(result);
  }
}
