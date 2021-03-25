package review;

public class Consonants {
	String str;
 public Consonants() {
	 
 }
 public Consonants(String str) {
	 this.str = str;
 }
 
 public String consonantes() {
	 //int strLen = this.str.length;
	 
	 return this.str.replaceAll("[aeiou]", "");
 }
}
