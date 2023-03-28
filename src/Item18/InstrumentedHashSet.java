package Item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount=0;

    public InstrumentedHashSet(){
    }

    public InstrumentedHashSet(int initCap, float loadFactor){
        super(initCap, loadFactor);
    }



    @Override
    public boolean addAll(Collection<? extends E> c){
        addCount += c.size();
        return super.addAll(c); //HashSet의 addAll을 호출
        // -> HashSet의 addAll()은 add()를 사용해서 구현했는데
        // 이 때 add()를 오버라이딩한 add()를 호출해서 사용함
    }

    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("1","2","3")); //3개의 원소를 더했으므로 3이 출력되길 기대함
        System.out.println(s.addCount);
    }
}
