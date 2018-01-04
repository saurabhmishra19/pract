package bst;

public class BSTImpl {

    public TreeNode root;

    public void add(int data){
        root=add(data,root);
    }

    private TreeNode add(int data, TreeNode node){
        if(node==null)
            node=new TreeNode(data);
        else if(data<node.val)
        {
            node.left=add(data,node.left);
        }else
        {
            node.right=add(data, node.right);
        }
        return node;
    }

    public void inorderTravesal(){
        inorderTrav(root);
    }
    private void inorderTrav(TreeNode node){
        if(node!=null) {
            inorderTrav(node.left);
            System.out.println(node.val);
            inorderTrav(node.right);
        }
    }




}
