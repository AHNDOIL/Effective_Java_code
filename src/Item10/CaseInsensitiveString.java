package Item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }


    @Override
    public boolean equals(Object o){
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }



    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish1");
        CaseInsensitiveString cis1 = new CaseInsensitiveString("Polish1");

        System.out.println(cis.equals(cis1));
        System.out.println(cis1.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(cis));
    }
}



