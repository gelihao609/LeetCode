import java.util.HashMap;
//review of hashmap
public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
    public boolean hasCycle(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
        while(head!=null)
        {
            if(map.containsKey(head.hashCode()))
            return true;
            else
            {
            map.put((Integer)head.hashCode(),head);
            }
            head=head.next;
        }
        return false;
        
    }
}
