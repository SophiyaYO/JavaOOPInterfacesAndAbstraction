import collectionHierarchy.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        AddCollection<String> addCollection =
                new AddCollectionImpl<>();

        AddRemoveCollection<String> addRemoveCollection =
                new AddRemoveCollectionImpl<>();

        MyList<String> myList =
                new MyListImpl<>();

        String[] tokens = reader.readLine().split(" ");

        int countIfRemovedElemet = Integer.parseInt(reader.readLine());

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();

        for (int i = 0; i < tokens.length; i++) {
            sb1.append(addCollection.add(tokens[i])).append(" ");
            sb2.append(addRemoveCollection.add(tokens[i])).append(" ");
            sb3.append(myList.add(tokens[i])).append(" ");

        }

        System.out.println(sb1.toString().trim());
        System.out.println(sb2.toString().trim());
        System.out.println(sb3.toString().trim());

        for (String token : tokens) {
            sb2.append(addRemoveCollection.remove()).append(" ");
            sb3.append(myList.remove()).append(" ");
        }
        System.out.println(sb4.toString().trim());
        System.out.println(sb5.toString().trim());


    }
}



