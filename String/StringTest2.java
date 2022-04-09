/**
 * String.intern() //如果字符串常量池中没有对应data的字符串的话，则在常量池中生成
 * 因此，如果底层出现了链表，那么它就得遍历链表去判断常量池中有没有该字符串，，链表太长的话效率降低
 */
public class StringTest2 {

    public static void main(String[] args) {
        System.out.println("打酱油。。。");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
