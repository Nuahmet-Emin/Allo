import java.util.*;

public class findParent {
    public static void main(String[] argv) {
        int[][] parentChildPairs = new int[][]{
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {15, 9}, {5, 7},
                {4, 5}, {4, 8}, {4, 9}, {9, 11}
        };

        /*
        [1, 2, 4, 15],       // Individuals with zero parents
        [5, 7, 8, 11]        // Individuals with exactly one parent
         */


        // TODO --- Call your function with the test case from above

        System.out.println(findNodesWithZeroAndOneParents(parentChildPairs));
    }

    // TODO --- Write your function

    public static List<List<Integer>> findNodesWithZeroAndOneParents(int[][] parentChildPairs) {

         List<List<Integer>> result = new ArrayList<>();

         List<Integer> zeroParents = new ArrayList<>();
         List<Integer> onlyOneParent = new ArrayList<>();

        for (int i = 0; i < parentChildPairs.length; i++) {
            int parent = parentChildPairs[i][0];
            int child = parentChildPairs[i][1];

            int parentCount = 0;
            int childCount =0;
            for (int j = 0; j < parentChildPairs.length ; j++) {
                if (parent == parentChildPairs[j][1]) {
                    parentCount++;
                }
                if(child == parentChildPairs[j][1]){
                    childCount ++;
                }
            }

            if(parentCount==0 && !zeroParents.contains(parent)){
                zeroParents.add(parent);
            }

            if(childCount==1){
                onlyOneParent.add(child);
            }

        }

        result.add(zeroParents);
        result.add(onlyOneParent);

        return result;
    }
}
/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique positive integer identifier.
​
For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
​
1   2    4   15
 \ /   / | \ /
  3   5  8  9
   \ / \     \
    6   7    11
​
​
Sample input/output (pseudodata):
​
parentChildPairs = [
    (1, 3), (2, 3), (3, 6), (5, 6), (15, 9),
    (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
]
​
(parent, child) (1, 3), (2, 3)
​
Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.
​
​
Output may be in any order:
​
findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4, 15],       // Individuals with zero parents
  [5, 7, 8, 11]        // Individuals with exactly one parent
]
​
n: number of pairs in the input
​
*/
