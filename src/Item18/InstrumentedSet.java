package Item18;

import java.util.*;

public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;
    public InstrumentedSet(Set<E> s) {
        super(s);
    }
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount(){ return addCount; }

    public static void main(String[] args){
        InstrumentedSet<String> set1 = new InstrumentedSet<>(new HashSet<>());
        set1.addAll(List.of("Lion", "Tube", "Apeach"));
        System.out.println(set1.getAddCount());

        InstrumentedSet<Integer> set2 = new InstrumentedSet<>(new TreeSet<>());
        set2.addAll(List.of(1,2,3,4,5));
        System.out.println(set2.getAddCount());

    }
}

