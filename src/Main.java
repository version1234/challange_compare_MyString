import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyString arr[] = new MyString[4];
        arr[0]=new MyString("Las Vegas");
        arr[1]=new MyString("NewYork");
        arr[2]=new MyString("Dallas");
        arr[3]=new MyString("Minnneapolis");

        System.out.println("Cities in Provided Order!");

        print(arr);

        System.out.println("Cites after sorted by length!");

        Arrays.sort(arr);
        print(arr);

    }

    public static void print(MyString[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getStr());
        }
    }

}