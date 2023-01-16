# Problem : Permuting Two Arrays

There are two n-element arrays of integers, ```A``` and ```B```. Permute them into some ```A'``` and ```B'``` such that the relation ```A'[i] + B'[i] >= k``` holds for all ```i``` where ```0 <= i <= n```.

There will be ```q``` queries consisting of ```A```, ```B```, and ```k```. For each query, return ```YES``` if some permutation ```A'```,```B'```  satisfying the relation exists. Otherwise, return ```NO```.

#### Example :

    A = [0, 1]
    B = [0, 2]
    k = 1

A valid ```A'```,```B'``` is ```A' = [1, 0]``` and ```B' = [0, 2]``` : ```1 + 0 >= 1``` and ```0 + 2 >= 1```. Return ```YES```.

Sample Input :

    STDIN       Function
    -----       --------
    2           q = 2
    3 10        A[] and B[] size n = 3, k = 10
    2 1 3       A = [2, 1, 3]
    7 8 9       B = [7, 8, 9]
    4 5         A[] and B[] size n = 4, k = 5
    1 2 2 1     A = [1, 2, 2, 1]
    3 3 3 4     B = [3, 3, 3, 4]

Sample Output :

    YES
    NO
