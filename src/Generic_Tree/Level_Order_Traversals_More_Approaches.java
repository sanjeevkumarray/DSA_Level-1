/*
package Generic_Tree;

public class Level_Order_Traversals_More_Approaches {
}

public static void levelOrderLinewise(Node node) {
  Queue < Node > mq = new ArrayDeque < > ( );

  mq.add(node);
  mq.add(new Node (-1));

  while (mq.size() > 0) {
    node = mq.remove();
    if (node.data != -1) {
      System.out.print(node.data + " ");

      for (Node child : node.children) {
        mq.add(child);
      }
    } else {
      if (mq.size() > 0) {
        mq.add(new Node(-1));
        System.out.println();
      }
    }
  }
}



public static void levelOrderLinewise3(Node node) {
  Queue < Node > mq = new ArrayDeque < > ( );

  mq.add(node);

  while (mq.size() > 0) {
    int cicl = mq.size();
    for (int i = 0; i < cicl; i++) {
      node = mq.remove();
      System.out.print(node.data + " ");

      for (Node child : node.children) {
        mq.add(child);
      }
    }
    System.out.println();
  }
}
public static void levelOrderLinewise4(Node node) {
  Queue < Pair > mq = new ArrayDeque < > ( );

  mq.add(new Pair(node, 1));

  int level = 1;
  while (mq.size() > 0) {
    Pair p = mq.remove();
    if (p.level > level) {
      level = p.level;
      System.out.println();
    }

    System.out.print(p.node.data + " ");
    for (Node child : p.node.children) {
      Pair cp = new Pair(child, p.level + 1);
      mq.add(cp);
    }
  }
}
 */
