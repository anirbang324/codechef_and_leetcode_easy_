# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def oddEvenList(self, head: ListNode):
        if(not head):
            return head
        odd = head
        even = odd.next
        evenlst = even

        while(even and even.next):
            odd.next = even.next
            odd = odd.next

            even.next = odd.next
            even = even.next

        odd.next = evenlst
        return head


s = Solution()
node_1 = ListNode(1)
node_2 = ListNode(2)
node_3 = ListNode(3)
node_4 = ListNode(4)
node_5 = ListNode(5)

node_1.next = node_2
node_2.next = node_3
node_3.next = node_4
node_4.next = node_5

ans = s.oddEvenList(node_1)
while(ans!=None):
    print(ans.val)
    ans = ans.next