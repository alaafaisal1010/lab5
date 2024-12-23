public class Q2 {public int size() {
    if (isEmpty()) return 0;
    int count = 0;
    Node<E> current = tail.next; // بداية القائمة
    do {
        count++;
        current = current.next; // الانتقال إلى العنصر التالي
    } while (current != tail.next); // العودة إلى الرأس
    return count;
}
}
