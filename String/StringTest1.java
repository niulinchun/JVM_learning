/**
 * 对String的任何改变都会创建新的字符串，比如拼接，重新赋值，替换字母
 *
 * 字符串常量池中是不会存储相同内存的字符串的
 * 因此底层是一个Map
 * String的String Pool是一个固定大小的HashTable，jdk6默认是1009， 这里不会发生扩容
 *
 * 可以通过-XX:StringTableSize=10 修改大小
 *
 * jdk7中StringTableSize默认位 60013
 *
 * jdk8开始StringTableSize最小值为1009，设置小于1009会报错
 * 当字符串很多时也会发生哈希冲突
 * 太小的话哈希冲突会导致数组退化为单链表，性能下降
 */

public class StringTest1 {

    public void test1() {
        String s1 = "abc";
        String s2 = "abc"; //两个引用指向同一个字符串常量

        System.out.println(s1 == s2);
        s1 = "hello"; //这里更改s1的值并不会使s2的值变化，而是重新创建一个字符串常量

        System.out.println(s1 == s2);
    }

    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};
    //这里到底是值传递和引用传递的问题，还是String不可变的问题
    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest1 stringTest1 = new StringTest1();
        stringTest1.change(stringTest1.str, stringTest1.ch);

        System.out.println(stringTest1.str);
        System.out.println(stringTest1.ch);
    }

}
