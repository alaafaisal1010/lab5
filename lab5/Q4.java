public class Q4 {
    public boolean areEqual(CircularlyLinkedList<E> L, CircularlyLinkedList<E> M) {
        if (L.size() != M.size()) {
            return false; // القائمتان ليس لهما نفس الطول
        }

        Node<E> currentL = L.tail.next; // الرأس في قائمة L
        Node<E> currentM;

        // ابدأ البحث في L
        do {
            currentM = M.tail.next; // الرأس في قائمة M
            boolean isEqual = true;

            // قارن العناصر في L و M
            for (int i = 0; i < L.size(); i++) {
                if (!currentL.element.equals(currentM.element)) {
                    isEqual = false;
                    break;
                }
                currentL = currentL.next;
                currentM = currentM.next;
            }

            if (isEqual) {
                return true; // وجدنا تطابقاً
            }

            // انتقل إلى العنصر التالي في L
            currentL = currentL.next;
        } while (currentL != L.tail.next); // استمر حتى نعود إلى الرأس

        return false; // لم نجد تطابق
    }
}
