public class Q3 {
    public boolean equals(Object obj) {
        if (!(obj instanceof CircularlyLinkedList)) return false;
        CircularlyLinkedList<E> other = (CircularlyLinkedList<E>) obj;
        if (this.size() != other.size()) return false;

        Node<E> current1 = this.tail.next; // بداية القائمة الحالية
        Node<E> current2 = other.tail.next; // بداية القائمة الأخرى

        do {
            if (!current1.element.equals(current2.element)) return false; // تحقق من العناصر
            current1 = current1.next; // الانتقال إلى العنصر التالي
            current2 = current2.next;
        } while (current1 != this.tail.next); // العودة إلى الرأس

        return true; // القائمتان متساويتان
    }
}
