public static Node reverseLinkedList(Node currentNode)
{
// For first node, previousNode will be null
Node previousNode=null;
  Node nextNode;
  while(currentNode!=null)
  {
   nextNode=currentNode.next;
  // reversing the link
   currentNode.next=previousNode;
  // moving currentNode and previousNode by 1 node
   previousNode=currentNode;
   currentNode=nextNode;
  }
  return previousNode;
 }
