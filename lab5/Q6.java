public class Q6 {
    public CircularlyLinkedList<E> clone() {
        CircularlyLinkedList<E> newList = new CircularlyLinkedList<>();
        if (isEmpty()) return newList; // إذا كانت القائمة فارغة، أعد قائمة فارغة

        Node<E> current = tail.next; // بداية القائمة الحالية
        do {
            newList.addLast(current.element); // إضافة العناصر إلى القائمة الجديدة
            current = current.next; // الانتقال إلى العنصر التالي
        } while (current != tail.next); // العودة إلى الرأس

        return newList; // إرجاع القائمة المكررة
    }
}
