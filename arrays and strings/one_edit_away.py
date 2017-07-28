"""
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
"""

def edit_away(string1, string2):
    """
    Args:   two strings
    Return: True/False, if they're one/zero edits away
    """
    diff = abs(len(string1) - len(string2))
    print(diff)

    if string1 == string2:
        return True

    if diff > 1:
        print(diff)
        return False

    count = 0
    temp = [i for i in string2]
    for char1 in string1:
        if char1 not in temp:
            print(count)
            count += 1

    # print("count: " + str(count))

    if count > 1:
        return False
    else:
        return True

def main():
    """
    args: None
    return: test edit_away
    """
    string_test1 = "pal"
    string_test2 = "pallp"

    if edit_away(string_test1, string_test2):
        print("are one edit away")
    else:
        print("aren't one edit away")


if __name__ == '__main__':
    main()
