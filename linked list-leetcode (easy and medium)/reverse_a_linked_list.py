class ListNode:
    def __init__(self,val =0,next=None):
        self.val = val
        self.next = next

class Solution:
    def revlist(self,head:ListNode):
        node = None

        while(head is not None):
            next = head.next
            head.next = node
            node = head
            head = next

        return node

s = Solution()

node_1 = ListNode(1)
node_2 = ListNode(4)
node_3 = ListNode(6)
node_4 = ListNode(8)

node_1.next = node_2
node_2.next = node_3
node_3.next = node_4

ans = s.revlist(node_1)

while(ans!=None):
    print(ans.val)
    ans = ans.next