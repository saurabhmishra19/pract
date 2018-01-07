package bst;

/**
 * Created by saurabh on 7/1/18.
 */
public class BSTSerialization {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer serIn=new StringBuffer();
        StringBuffer serPre=new StringBuffer();
        inorder(root, serIn);
        preorder(root,serPre);
        return serIn.toString()+"##"+serPre.toString();
    }


    public void inorder(TreeNode node , StringBuffer value){
        if(node!=null){
            inorder(node.left, value);
            value.append(node.val).append(",");
            inorder(node.right, value);
        }

    }


    public void preorder(TreeNode node , StringBuffer value){
        if(node!=null){
            value.append(node.val).append(",");
            preorder(node.left, value);

            preorder(node.right, value);
        }

    }



    // Decodes your encoded data to tree.
    //1,2,6,7,9,##7,1,2,6,9,
    public TreeNode deserialize(String data) {
        String [] orders=data.split("##");
        orders[0]=orders[0].substring(0,orders[0].lastIndexOf(','));
        orders[1]=orders[1].substring(0,orders[1].lastIndexOf(','));
        System.out.print(orders[0]);
        System.out.print(orders[1]);
        String [] inorder=orders[0].split(",");
        String [] preorder=orders[1].split(",");
        TreeNode root=null;

        for(int i=0;i<preorder.length;i++){
           TreeNode node=new TreeNode(Integer.parseInt(preorder[i]));
            if(root==null){
            root=node;
            }
        int j=searchInorder(preorder[i],inorder);


        }
        return null;
    }

    public int searchInorder(String val,String []inorder){
        for(int j=0;j<inorder.length;j++){
            if(inorder[j].equals(val))
            return j;
        }
        return -1;
    }


}
