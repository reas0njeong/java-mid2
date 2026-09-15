package array;

public class MyArrayListMainV3 {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"addLast"); // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);// O(n)

        // 삭제
        Object removed1 = list.remove(4); //remove Last O(1)
        System.out.println("remove(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0); // remove First O(n)
        System.out.println("remove(0) = " + removed2);
        System.out.println(list);
    }
}
