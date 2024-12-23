public class Q5 {
    public void split() {
        if (isEmpty() || tail.next == tail) return; // القائمة فارغة أو تحتوي على عنصر واحد

        Node<E> slow = tail.next; // بداية القائمة
        Node<E> fast = tail.next; // بداية القائمة

        // استخدام تقنية البطيء والسريع لتحديد منتصف القائمة
        while (fast != tail && fast.next != tail) {
            slow = slow.next; // يتحرك ببطء
            fast = fast.next.next; // يتحرك بسرعة
        }

        CircularlyLinkedList<E> secondHalf = new CircularlyLinkedList<>();
        secondHalf.tail = tail; // تشير إلى الذيل القديم
        secondHalf.tail.next = slow.next; // بداية النصف الثاني

        slow.next = tail.next; // إنهاء النصف الأول
        tail = slow; // تحديث ذيل القائمة الأصلية
    }
}
