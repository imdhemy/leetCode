# 392. Is Subsequence

#### Approach 1: Recursion

**Intuition**

If there were no Kleene stars (the  `*`  wildcard character for regular expressions), the problem would be easier - we simply check from left to right if each character of the text matches the pattern.

When a star is present, we may need to check many different suffixes of the text and see if they match the rest of the pattern. A recursive solution is a straightforward way to represent this relationship.

**Algorithm**

Without a Kleene star, our solution would look like this:

If a star is present in the pattern, it will be in the second position  ext{pattern[1]}extpattern[1]. Then, we may ignore this part of the pattern, or delete a matching character in the text. If we have a match on the remaining strings after any of these operations, then the initial inputs matched.

**Complexity Analysis**

-   Time Complexity: Let  T, PT,P  be the lengths of the text and the pattern respectively. In the worst case, a call to  `match(text[i:], pattern[2j:])`  will be made inom{i+j}{i} times, and strings of the order  O(T - i)O(T−i)  and  O(P - 2*j)O(P−2∗j)  will be made. Thus, the complexity has the order sum_{i = 0}^T sum_{j = 0}^{P/2} inom{i+j}{i} O(T+P-i-2j). With some effort outside the scope of this article, we can show this is bounded by Oig((T+P)2^{T + rac{P}{2}}ig).
    
-   Space Complexity: For every call to  `match`, we will create those strings as described above, possibly creating duplicates. If memory is not freed, this will also take a total of Oig((T+P)2^{T + rac{P}{2}}ig) space, even though there are only order  O(T^2 + P^2)O(T2+P2)  unique suffixes of  PP  and  TT  that are actually required.  
      
    

----------

#### Approach 2: Dynamic Programming

**Intuition**

As the problem has an  **optimal substructure**, it is natural to cache intermediate results. We ask the question  ext{dp(i, j)}extdp(i,j): does  ext{text[i:]}exttext[i:]  and  ext{pattern[j:]}extpattern[j:]  match? We can describe our answer in terms of answers to questions involving smaller strings.

**Algorithm**

We proceed with the same recursion as in  [Approach 1](#approach-1-recursion), except because calls will only ever be made to  `match(text[i:], pattern[j:])`, we use  ext{dp(i, j)}extdp(i,j)  to handle those calls instead, saving us expensive string-building operations and allowing us to cache the intermediate results.

_Top-Down Variation_

_Bottom-Up Variation_

**Complexity Analysis**

-   Time Complexity: Let  T, PT,P  be the lengths of the text and the pattern respectively. The work for every call to  `dp(i, j)`  for  i=0, ... ,Ti=0,...,T;  j=0, ... ,Pj=0,...,P  is done once, and it is  O(1)O(1)  work. Hence, the time complexity is  O(TP)O(TP).
    
-   Space Complexity: The only memory we use is the  O(TP)O(TP)  boolean entries in our cache. Hence, the space complexity is  O(TP)O(TP).
