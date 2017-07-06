"""
Palindrome permutation:
Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
"""

def pal_permutation(string1):
    """
    Args:   string
    Return: True/False
    """
    temp = [0 for i in range(26)]

    for i in string1:
        if i != " ":
            val = ord(i)
            if val >= 91 and val <= 122:
                position = val - ord('a')
                temp[position] += 1
            elif val <= 90 and val >= 65:
                position = val - ord('A')
                temp[position] += 1

    count_list = sum(temp)
    count_odd = 0
    even_flag = 0

    if count_list % 2 == 1:
        for i in temp:
            if i % 2 == 1:
                count_odd += 1
    else:
        if even_flag == 0:
            for i in temp:
                if i % 2 != 0:
                    even_flag = 1

    if count_list % 2 == 1 and count_odd == 1:
        return True
    elif count_list % 2 == 0 and even_flag == 0:
        return True
    else:
        return False


    # print(count_odd)
    # print(even_flag)



def main():
    """
    args: None
    return: test pal_permut
    """
    string_test = "Tact Coa"

    if pal_permutation(string_test):
        print(string_test + " is palindrome")
    else:
        print(string_test + " isn't palindrome")


if __name__ == '__main__':
    main()


