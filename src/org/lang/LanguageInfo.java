package org.lang;

public class LanguageInfo {
private void tamilLanguage() {
	System.out.println(" Tamil Language is very Old");
}
private void englishLanguage() {
	System.out.println("English language is World wide spoken");
}
private void hindiLanguage() {
	System.out.println("Hindi is common language in India");
}
public static void main(String[] args) {
	LanguageInfo a=new LanguageInfo();
	a.englishLanguage();
	a.tamilLanguage();
	a.englishLanguage();
	
	StateDetails b=new StateDetails();
	b.southIndia();
	b.northIndia();
}
}
