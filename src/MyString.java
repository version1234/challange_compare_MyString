public class MyString  implements Comparable<MyString>  {
    private String str;

    public MyString(String str) {
        assert str != null;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyString myString)
    {

        return this.str.length() - myString.str.length();
    }


}
