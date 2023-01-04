# Problem : Sparse Arrays

There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

Example :

    strings = ["ab", "ab", "abc"]
    queries = ["ab", "abc", "bc"]


There are ```2``` instances of ```"ab"```, ```1```of ```"abc"``` and ```0``` of ```"bc"```. For each query, add an element to the return array, ```results = [2, 1, 0]```.


Sample Input 1 :

    4
    aba
    baba
    aba
    xzxb
    3
    aba
    xzxb
    ab

Sample Output 1 :

    2
    1
    0

Sample Input 2 :

    3
    def
    de
    fgh
    3
    de
    lmn
    fgh

Sample Output 2 :

    1
    0
    1

Sample Input 3 :

    13
    abcde
    sdaklfj
    asdjf
    na
    basdn
    sdaklfj
    asdjf
    na
    asdjf
    na
    basdn
    sdaklfj
    asdjf
    5
    abcde
    sdaklfj
    asdjf
    na
    basdn

Sample Output 3 :

    1
    3
    4
    3
    2