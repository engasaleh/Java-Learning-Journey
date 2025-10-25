public class Main {
    public static void main(String[] args) {

        System.out.println("Hello in a new chapter in your Java Course\n\n");


        String name = "Password";



        //int length = name.length();
        //char letter = name.charAt(2);
        //int index = name.indexOf("e");  // Gives you the First Index
        //int lastIndex = name.indexOf("h");  //Gives you the Last Index


        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("o", "a");






       /* if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.printf("Hello %s", name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain a spaces");
        }
        */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }

    }
}
