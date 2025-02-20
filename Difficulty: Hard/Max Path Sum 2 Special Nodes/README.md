<h2><a href="https://www.geeksforgeeks.org/problems/maximum-path-sum/1">Max Path Sum 2 Special Nodes</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a <strong>binary tree</strong> in which each node element contains a number. Find the <strong>maximum</strong> possible path sum from one <strong>special node</strong> to another special node.</span></p>
<p><span style="font-size: 18px;"><strong>Note: </strong>Here special node is a node that is connected to exactly one different node.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root =</span><strong style="font-size: 18px;"> </strong><span style="font-size: 18px;">[3, 4, 5, -10, 4, N, N]<br>
           3                               
         /   \                          
       4      5                     
      /  \      
    -10   4                          </span></span>
<span style="font-size: 18px;"><strong>Output:</strong> 16</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>Maximum Sum lies between special node 4 and 5. 4 + 4 + 3 + 5 = 16.</span>
</pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root =</span><strong style="font-size: 18px;"> </strong><span style="font-size: 18px;">[-15, 5, 6, -8, 1, 3, 9, 2, -3, 0, 4, -1, 10]

            -15                               
           /    \                          
          5      6                      
        /  \    /  \
      -8    1  3    9
     /  \            \
    2   -3            0
                     / \
                    4  -1
                       /
                     10  </span></span>
<span style="font-size: 18px;"><strong>Output:</strong>  27</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>The maximum possible sum from one special node to another is (3 + 6 + 9 + 0 + -1 + 10 = 27)<br></span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root =</span><strong style="font-size: 18px;"> </strong><span style="font-size: 18px;">[3, 4, 1, -10, 4]
           3                               
          / \                          
        4    1                     
       / \      
     -10  4                          </span></span>
<span style="font-size: 18px;"><strong>Output:</strong> 12</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>Maximum Sum lies between special node 4 and 5. 4 + 4 + 3 + 1 = 12.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">2&nbsp; ≤&nbsp; number of nodes&nbsp; ≤&nbsp; 10<sup>4</sup></span><br><span style="font-size: 18px;">-10<sup>3&nbsp;&nbsp;</sup>≤ node-&gt;data ≤ 10<sup>3</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>OYO Rooms</code>&nbsp;<code>FactSet</code>&nbsp;<code>Directi</code>&nbsp;<code>Facebook</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;