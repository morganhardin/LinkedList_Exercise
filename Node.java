public class Node 
{
	public Node nextNode;
    public int data;
    
    public Node(int data)
    {
        this.nextNode = null;
        this.data = data;
    }
    
    public void setNextNode(Node NextNode)
    {
        this.nextNode = nextNode;
    }
    public Node getNextNode()
    {
        return nextNode;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }
}
