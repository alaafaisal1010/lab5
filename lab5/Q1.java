public class Q1 {
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            newNode.next = newNode; // تشير إلى نفسها
            tail = newNode; // تشير الذيل إلى العقدة الجديدة
        } else {
            newNode.next = tail.next; // تشير العقدة الجديدة إلى الرأس الحالي
            tail.next = newNode; // تشير الذيل الآن إلى العقدة الجديدة
        }
    }
}
