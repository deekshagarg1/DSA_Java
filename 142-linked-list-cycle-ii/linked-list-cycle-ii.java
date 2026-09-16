/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {

//  // length helper function------------
// public static int cycleLength(ListNode node){
//     int length = 0;
//     ListNode temp = node; // node is taken as slow node
//     do{
//         temp = temp.next;
//         length++;
//     }while(temp != node);
//     return length;
// }

//  public ListNode detectCycle(ListNode head) {

//     ListNode fast = head;
//     ListNode slow = head;

// // detect cycle
//     while( fast != null && fast.next != null){
//         slow = slow.next;
//         fast = fast.next.next;

//         if(fast == slow){ //cycle found
//            int length = cycleLength(slow);
               
//             // f and s are new pointer of current location of head/start se
//             ListNode f = head;
//             ListNode s = head;

//             //formula ==  length -(length - distance from starting of list)
//             while(length > 0){ //moving slow pointer to the length of cycle
//                 s = s.next;
//                 length--;
//             }

//              //keep moving both pointers forward and they will meet at cycle start at same speed
//             while(f != s){
//                 f = f.next;
//                 s = s.next;
//             }
//             return s;
//         }
//     }
//     return null;
//   } 
// }


public class Solution {
   public ListNode detectCycle(ListNode head) {

    ListNode fast = head;
    ListNode slow = head;

    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;

        if(slow == fast){
            slow = head;
        
        //meet point k badh, slow ko head prr rakhte h, and fast ko meet position pe hi, dono pointers ko abb one place move kerte jate, so dono starting of cycle prr meet up kerte
            while(fast != slow){
                slow = slow.next;
                fast = fast.next;
            }
        return slow;
        }
    }
        return null;
  } 
}