import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        int k=10;
        int l=20;
/*
        TreeSet<Integer> integers=new TreeSet<Integer>();

        integers.add(1000);
        integers.add(2000);
        integers.add(3000);
        integers.add(3000);

        System.out.println(integers.floor(1000));//1000
        System.out.println(integers.lower(1000));//null
        System.out.println(integers.higher(3000));//null
        System.out.println(integers.ceiling(3000));//3000

        System.out.println(integers.pollFirst());
        System.out.println(integers.pollLast());
        System.out.println(integers.descendingSet());

        System.out.println(integers);*/

/*
        TreeMap<String,String> treeMap=new TreeMap<String ,String>();

        treeMap.put("a","Apple");
        treeMap.put("b","Banana");
        treeMap.put("c","Cat");
        treeMap.put("d","Dog");


        System.out.println(treeMap.ceilingKey("c"));//c
        System.out.println(treeMap.lowerKey("c"));//b
        System.out.println(treeMap.higherKey("b"));//c
        System.out.println(treeMap.floorKey("a"));//a
        System.out.println(treeMap.pollFirstEntry());//a=Apple
        System.out.println(treeMap.pollLastEntry());//d=Dog
        System.out.println(treeMap.descendingMap());//{b=banana,c=Cat}*/

/*
        ArrayList arrayList=new ArrayList();
        arrayList.add(111);
        arrayList.add(444);



        arrayList.add(222);
        arrayList.add(333);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);*/

/*

        int[] ints={10,70,30,10};
        int[] k=ints;
        for (int i:k){
            System.out.println(i);
        }
        System.out.println("Before sorting ");
        Arrays.sort(k);
        System.out.println("After sorting");
        for(int k1:k){

            System.out.println(k1);
        }

        String[] str={"a","c","b"};
        System.out.println("Before sorting");
        for (String s:str){
            System.out.println(s);
        }

        System.out.println("After sorting");
        Arrays.sort(str);
        for(String str1:str){
            System.out.println(str1);
        }


        System.out.println("This is my own Array sorting order technique that is custom sorting order");
        Arrays.sort(str,new MyComparator());
        for (String str2:str){
            System.out.println(str2);
        }
*/

        int[]  i={10,30,20};
        Arrays.sort(i);

       int i1= Arrays.binarySearch(i,20);
        out.println(i1);


        String[] s={"a","l","a"};
        Arrays.sort(s);

       int i2= Arrays.binarySearch(s,"l");
        out.println(i2);

        String[] str1={"10","A","L"};
        Arrays.sort(str1);
        int i3=Arrays.binarySearch(str1,10,new MyComparator());
        out.println(i3);

        out.println(i3);

        List l=new Stack();
        l.add(1);
        Object[] i9= l.toArray();
        i9[0]=30;
        out.println(i[2]);
         }
}


class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        String str2=o1.toString();
        String str3=o2.toString();

        return str3.compareTo(str2);
    }
}