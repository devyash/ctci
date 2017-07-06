"""
replace " " with %20 in a string
"""

def urlify(string1, length1):
    """
    Args: string, length of string
    Return: replace string
    """
    string2 = ""
    for i in range(length1):
        if string1[i] == " ":
            string2 = string2 + "%20"
        else:
            string2 = string2 + string1[i]
    return string2


def main():
    """
    args: None
    return: Print URLified string
    """
    string_test = "Mr John Smith     "
    length_test = 13
    print("Replaced string: " + urlify(string_test, length_test))

if __name__ == '__main__':
    main()

