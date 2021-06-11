package za.ac.cput.Factory;

/**
 * authorFactory.java
 * This code represents the AuthorFactory.
 * @author: Melven Johannes Booysen (219201277)
 * Date: 10 June 2021
 */


import za.ac.cput.Entity.Author;
import za.ac.cput.Util.GenericHelper;


public class AuthorFactory
{
    public static Author createAuthor(String name, String surname, String bio)
    {
       String authorId = GenericHelper.generateId();

        //creating an instance
        Author author = new Author.Builder()
                .setAuthorId(authorId)
                .setName(name)
                .setSurname(surname)
                .setBio(bio)
                .build();

                return author;
    }

}//*** End of class
