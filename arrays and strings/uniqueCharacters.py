def uniqueCharacters(s):
	"""
	check if the supplied string is having unique characters or not.
	args: string as s
	return: print if string is unique or not
	"""
    k = 1
    for c in s:
        if c in s[k:]:
            print("String ain't unique")
            k = 0
            break
        k = k + 1

    if k != 0:
        print("String is unique")

def boolUniqueChararacters(s):
	"""
	check if the supplied string is having unique characters or not.
	args: string as s
	return: True/False
	"""

	checker = 0
	val = 0
	for i in s:
		val = ord(i) - ord('a');

		# Here '&' does bitwise equality 
		# Unlike the "and" or "&&" in Java, which is boolean equality

		if (checker & (1 << val)) > 0:	
			# print("\nbin eq of val: " + str(bin(val))[2:] + "\t bin eq of (1 << val): " + str(bin(1<<val))[2:] + "\t bin eq of checker && (1 << val): " + str(bin(checker & (1 << val)))[2:])
			return False

		# print(str(bin(checker & (1 << val)))[2:])
		
		checker |= (1 << val)
		
		# print("bin eq of val: " + str(bin(val))[2:] + "\t bin eq of (1 << val): " + str(bin(1<<val))[2:] + "\t\t bin eq of checker: " + str(bin(checker))[2:])

	return True

# test here
s = "zxtyxg"

# uniqueCharacters(s)

p = boolUniqueChararacters(s)
if p:
	print("\nString is unique")
else:
	print("\nString isn't unique")

