Nowadays, we are surrounded by lies all the time. But if we look close enough, we will always find exactly one truth for each matter. In this task, we will try to put that truth in the middle.

Let's say we have a n x n matrix (n > 1 and must be an odd number), consisting of n^2 - 1 false statements and a single true statement. Let's index the matrix rows by numbers from 1 to n from top to bottom, let's index the matrix columns by numbers from 1 to n from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

- Swap two neighboring rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < n). 

- Swap two neighboring columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < n).

Let's look for the true statement and put it in the middle of the matrix. For example, if n =5, then we need to put the true value in the cell that is on the intersection of the third row and the third column. Your task is to count the minimum number of moves needed to put the true statement in the middle of the matrix.

**Input:**

Dimension of the matrix, n.  

The input consists of n lines, each line contains n characters, either F or T.   

**Output:**  

Print a single integer - the minimum number of moves needed to put the truth in the middle (i.e. the distance between the truth and the middle of the matrix).

n must be greater than 1 and an odd number. If not, return "Invalid size of the matrix"

There must be exactly one T in the matrix. If not, return "Error! Exactly one truth please"

Sample Input1:

5  
F F F F F   
F F F F T   
F F F F F   
F F F F F   
F F F F F  

Sample output1:

3  

Sample Input2:

5  
F F F F F   
F F F F F   
F T F F F   
F F F F F   
F F F F F  

Sample output2:

1  

Sample Input3:

5  
T F F F F   
F F F F F   
F F F F F   
F F F F F   
F F F F T  

Sample output3:

Error! Exactly one truth please  

Sample Input4:

4  
F F F F   
F F F F   
F F F F   
F F F T  

Sample output4:

Invalid size of the matrix
