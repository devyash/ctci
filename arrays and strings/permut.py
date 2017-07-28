""" check if string s1 and s2 are permutations of each other"""
def permut(string1, string2):
    """
    Args: strings s1 and s2
    return: true/false
    """
    for i in string1:
        if i not in string2:
            return False
    return True

def hashpermut(string1, string2):
    """
    kind using hashes in some way
    args: string s1, s2
    return: True/False
    """
    keep = [-1 for k in range(51)]

    # Here, list is created for each value present
    for i in string1:
        position = ord(i) - ord('A')
        if keep[position] == -1:
            keep[position] = 1

    # Here it is checked with the list created before
    for j in string2:
        position = ord(j) - ord('A')
        if keep[position] == -1:
            return False
    return True


def main():
    """
    args: None
    return: print permutation / (not a permutation)
    """
    string1 = "abcd"
    string2 = "abcdcba"

    k = hashpermut(string1, string2)

    if k:
        print("Strings are permutations of each other")
    else:
        print("Strings aren't permutations of each other")

if __name__ == "__main__":
    main()
