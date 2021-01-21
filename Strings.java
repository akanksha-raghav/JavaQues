//non-primitive, immutable
public class Strings{
    public static void main(String[] args) {
        String a = "Akanksha" ; // initialisation by literals- done in doble quotes
        // string pool area - create a string if it is not present in the pool , if the string is present it returns the value of the previously present string
        // another way of initialsation
        String c = "Akanksha";
        String b = new String("Akanksha"); 
        // new object created and saved in heap area and in string pool area if its not present before
        String d ="";
        String color = "Red,Yellow,Green,Blue,Pink,Grey,Black,White";
        // split function
        String colors[] = color.split(",");
        for(String e: colors){
            System.out.println(e);
        }
        System.out.println(a==b); // one in heap one in pool area
        System.out.println(a==c); // both are same in pool area and no new string c is created
        System.out.println(a.charAt(4)); // return char at index value like arrays
        System.out.println(a.indexOf('s')); // return first index of character
        System.out.println(a.toLowerCase()); // lowercase
        System.out.println(a.toUpperCase()); // uppercase
        System.out.println(a.length()); //return length
        System.out.println(a.substring(5)); // return substring begin from 5 index till end
        System.out.println(a.substring(3,7)); // return substring from 3 to 7 index position
        System.out.println(a.contains("Aka")); // return booleans value if a char or string is present
        System.out.println(a.equals(b)); // check if the value is same or not
        System.out.println(d.isEmpty()); // check if the string is empty
        System.out.println(a.concat(" Raghav")); //concat strings , is also done by +
        System.out.println(a.replace('a','v')); //replace character in string given
        String name = "    Bittu";
        System.out.println(name);
        System.out.println(name.trim()); // remove extra spaces
    }
}