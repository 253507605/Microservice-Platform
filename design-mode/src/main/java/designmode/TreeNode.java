package designmode;

/**
 * @Author Jason.Chen
 * @create 2023/9/4 13:21
 */
public class TreeNode {

    private int value;

    private TreeNode next;

    public TreeNode(){}
    public TreeNode(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getNext() {
        return next;
    }

    public void setNext(TreeNode next) {
        this.next = next;
    }
}
