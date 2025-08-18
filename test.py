class Node:
    def __init__(self,data=None,next=None):
        self.data=data
        self.next=next
class LL:
    def __init__(self):
        self.head=None
    def insertFirst(self,data):
        n=Node(data,self.head)
        self.head=n
    def insertLast(self,data):
        n=Node(data)
        p=self.head
        while p.next:
            p=p.next
        p.next=n
    def insertAny(self,data,pos=1):
        n=Node(data)
        p=self.head
        if pos==1:
            self.insertFirst(data)
        else:
            for i in range(pos-1):
                q=p
                p=p.next
            q.next=n
            n.next=p
    def display(self):
        p=self.head
        while p:
            print(p.data,end=" ")
            p=p.next
    def delFirst(self):
        if self.head==None:
            print("Empty")
        else:
            self.head=self.head.next
    def delLast(self):
        p=self.head
        if self.head==None:
            print("Empty")
        else:
            while p.next:
                q=p
                p=p.next
            q.next=None   
    def delAny(self,pos):
        p=self.head
        if pos==1:
            self.delFirst()
        else:
            for i in range(pos-1):
                q=p
                p=p.next
            q.next=p.next

l1=LL()
print(l1.head)
l1.insertFirst(10)
l1.insertLast(20)
l1.insertLast(30)
l1.insertAny(40,3)
l1.delLast()
l1.delAny(2)
l1.display()