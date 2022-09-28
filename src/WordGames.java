/**
 * @author Drumstyle92
 * The class that contains the two methods of the program.
 */
public class WordGames {
    /**
     * @param word Parameter where then to put only Strings. Outbox will come out after Hello.
     * @return This method returns two strings: Hello and Parameter (our input).
     * Method used to print Hello + the nikname.
     */
    public String addHelloWord(String word){
        String word2 = " Hello ";
        return word2 + word;
    }

    /**
     *
     * @param name The parameter where the name is to be assigned.
     * @param surname The parameter where the surname is to be assigned.
     * @return The return is void.
     * The method in question is used to print the name and surname.
     */
    void getFullName(String name,String surname){
        System.out.println(name + surname);
    }
}
