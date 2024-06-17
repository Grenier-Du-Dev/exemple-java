package package_en_java;
import java.util.*;

public class Article {

    public static void main(String[] args) {
        List<ArticleItem> myList = new ArrayList<>();
        myList.add(new ArticleItem(1, "Comment utiliser les package en java il faut..."));
        myList.add(new ArticleItem(2, "Comment lire le contenu d'un ...."));
        myList.add(new ArticleItem(3, "C'est quoi la programmation orienté objet..."));
        System.out.println(myList);
    } 
}

class ArticleItem {
    int id;
    String content;
    
    public ArticleItem(int id, String content){
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleItem [id=" + id + ", content=" + content + "]";
    }
}

