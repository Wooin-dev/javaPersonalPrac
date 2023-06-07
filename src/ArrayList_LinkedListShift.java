import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedListShift {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        // 나중에 여기를 LinkedList <-> ArrayList 등 List 구현체라면 바꿀 수 있음.
        //  아래는 List를 implements받은 클래스들.
        //      Collection, Set, ArrayList, LinkedList,
        //      Vector, Arrays.asList(Object[]), Collections.nCopies(int, Object),
        //      Collections.EMPTY_LIST, AbstractList, AbstractSequentialList


        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); //[1, 2, 3]

        list = new LinkedList<>();
        //List 타입으로 받았다고 해서 이렇게 뒤에가서 초기화를 시킬수는 있지만,
        //이보다는 위에 쓰여진 코드를 그저 LinkedList로 바꿔도 다른 코드까지 수정하지 않아도 되는
        //유지보수 측면에서의 장점이 있다고 한다.

        System.out.println(list); //[] 초기화 됐음.


    }

}
