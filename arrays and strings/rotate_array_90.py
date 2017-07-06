"""
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
"""

def rotate_90(matrix):
    """
    Args:   2-D list
    Return: 90-degree rotated 2-D list
    """
    """
    Start at 0, 0

    """
    return matrix


def main():
    """
    args: None
    return: test str_compress
    """
    temp = [[0, 1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11], [12, 13, 14, 15]]
    k = rotate_90(temp)
    for i in k:
        for j in i:
            print(j, end="\t")
        print()


if __name__ == '__main__':
    main()
