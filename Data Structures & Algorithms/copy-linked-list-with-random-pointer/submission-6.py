class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        oldCopy = {None : None}

        curr = head
        while curr:
            copy = Node(curr.val)
            oldCopy[curr] = copy
            curr = curr.next
        
        curr = head
        while curr:
            copy = oldCopy[curr]
            copy.next = oldCopy[curr.next]
            copy.random = oldCopy[curr.random]
            curr = curr.next
        
        return oldCopy[head]