Given a Binary Tree, The task is to connect all the adjacent nodes at the same level starting from the left-most node of that level, and ending at the right-most node using nextRight pointer by setting these pointers to point the next right for each node. 

Examples: 

Input:

         1
       / \
     2   3
    / \    \
  4   5   6


Output:

         1—>NULL
       /  \
     2–>3–>NULL
   /   \      \
 4–>5–>6–>NULL

Input:

        10
       /  \
    12   15
    / \    \
  5   4   3

Output:

         10—>NULL
       /     \
    12–>15–>NULL
   /   \      \
 5–>4–>3–>NULL
