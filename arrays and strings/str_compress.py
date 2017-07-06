"""

String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

"""
def str_compress(og_string):
    """
    Args: string
    Return: compressed string
    """
    i = 1
    new_string = og_string[0]
    new_string_index = 0
    count = 1

    while i < len(og_string):
        if og_string[i] == new_string[new_string_index]:
            count += 1
            i += 1
        else:
            new_string = new_string + str(count) + og_string[i]
            count = 1
            i += 1
            new_string_index += 2

    return new_string+str(count)




def main():
    """
    args: None
    return: test str_compress
    """
    string_test = "aabbbccccdddddaa"
    print(str_compress(string_test))


if __name__ == '__main__':
    main()
