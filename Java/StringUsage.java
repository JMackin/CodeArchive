/*
 * Name:       Rob Lapkass
 *
 * Filename:   StringUsage.java
 *
 * Course:     CS-12
 *
 * Date:       10/02/14
 *
 * Purpose:    Lecture examples for String usage of basic methods
 */
 
public class StringUsage {

    public static void main(String [] args) {
   
        // variable declarations
        int len, index;
        char firstChar, lastChar;
        String substr1, substr2, substr3, findStr;
        int loc;
        String str1, str2, str3, toGet, item;
        int num;
        SimpleDate myBirthday;

        //-------------------------------------------------------------------------
        // creation of Strings (constructors and assignment)
        
        String greeting = new String("Hello");
        String empty = new String();
        String message = "This is another way of creating a String";
        
        //-------------------------------------------------------------------------
        // length
        
        len = greeting.length();
        System.out.println("length: " + len + "\t" + greeting);
        len = empty.length();
        System.out.println("length: " + len + "\t" + empty);
        len = message.length();
        System.out.println("length: " + len + "\t" + message);
                
        //-------------------------------------------------------------------------        
        // characters at a specific index
        
        greeting = "Hello";                  // reset to original value
        firstChar = greeting.charAt(0);      // firstChar = 'H'
        System.out.println("firstChar = " + firstChar);
        
        // don't do this: this works only for this one string
        lastChar = greeting.charAt(4);       // lastChar = 'o'
        System.out.println("lastChar = " + lastChar);
        
        // do this instead: this is completely general
        lastChar = greeting.charAt( greeting.length()-1 );  // lastChar = 'o' also
        System.out.println("lastChar = " + lastChar);
        
        //-------------------------------------------------------------------------
        // finding a substring within a string
        index = greeting.indexOf('e');       // index = 1
        System.out.println("first e is at: " + index);
        
        index = greeting.indexOf('l');       // index = 2, finds FIRST one
        System.out.println("first l is at: " + index);
        
        index = greeting.indexOf('l');       // index = 2, finds FIRST one
        System.out.println("first l is at: " + index);
        
        index = greeting.indexOf("lo");      // index = 3
        System.out.println("first lo is at: " + index);
        
        index = message.indexOf("another");  // find entire phrase, not a letter
        System.out.println("another is at: " + index + "\nin string: " + message);
        
        index = message.indexOf("annother"); // this phrase is misspelled, won't be found
        System.out.println("annother is at: " + index + "\nin string: " + message);
        
        //-------------------------------------------------------------------------
        // extracting a substring from a string
        substr1 = greeting.substring(0, 2);                 // "He"
        System.out.println("substr1 = " + substr1);
        
        substr2 = greeting.substring(3, greeting.length() );   // "lo"
        System.out.println("substr2 = " + substr2);
        
        // more general: we need to FIND the index first before we can use it to extract
        findStr = "way";
        loc = message.indexOf(findStr);
        substr3 = message.substring(loc, loc + findStr.length());
        System.out.println("found string: " + substr3 + "  length: " + substr3.length());
        
       //-------------------------------------------------------------------------
        // case changing methods
        
        greeting.toUpperCase();        // nothing happens to new copy
        System.out.println("1." + greeting);  // still "Hello"
        
        System.out.println("2." + greeting.toUpperCase()); // "HELLO", original unchanged
        System.out.println("3." + greeting.toLowerCase()); // "hello", original unchanged
        System.out.println("4." + greeting);  // still "Hello"
        
        greeting = greeting.toUpperCase();
        System.out.println("5." + greeting);  // greeting is now "HELLO"
        
        //-------------------------------------------------------------------------
        // string concatentation examples
        
        // String variable + String variable
        str1 = new String("Thing 1");
        str2 = new String("Thing 2");
        str3 = str1 + " + " + str2;
        System.out.println("str3 = " + str3);
        
        // String literal + numerical variable
        num = 40;
        System.out.println("num = " + num);
        
        // String literal + String variables, using shortcut operator
        toGet = "list: ";
        System.out.println(toGet);
        
        item = "milk";
        toGet += (item + ", ");
        System.out.println(toGet);
        
        item = "bananas";
        toGet += item;
        System.out.println(toGet);
        
        // String literal + object
        myBirthday = new SimpleDate(7, 18, 2014);
        System.out.println("my BD = " + myBirthday.toString() ); // explicit toString()
        System.out.println("my BD = " + myBirthday );            // implicit toString()    
                    
    }

}