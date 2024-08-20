package enums_composicao.ex_02.application;

import enums_composicao.ex_02.entities.Comment;
import enums_composicao.ex_02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this " +
                "wonderful country!", 12);
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Goog night guys", "See you tomorrow", 5);

        p1.addComment(new Comment("Have a nice trip"));
        p1.addComment(new Comment("Wow that's awesome!"));

        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May the Force be with you"));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
