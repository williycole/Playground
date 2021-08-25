# ==================================Project Overview=======================================

# This project is for harvard cs50 class. I used this project as a quick learning tool to familiarize myself with python
# STR is where dna has high gentic diversity
# STR tend to repeat and the number of times they repeat vary between indiviuals

# =============CSV Example===============
# name,AGAT,AATG,TATC
# Alice,28,42,14
# Bob,17,22,19
# Charlie,36,18,25

# The data in the above file would suggest that Alice has the sequence AGAT repeated 28 times consecutively somewhere
# in her DNA, the sequence AATG repeated 42 times, and TATC repeated 14 times.
# Bob, meanwhile, has those same three STRs repeated 17 times, 22 times, and 19 times, respectively.
# And Charlie has those same three STRs repeated 36, 18, and 25 times, respectively.

# ============Program Sepcs===============
# 1 first cmd line argument should be the name of the csv file
# 2 second cmd line argument name of text file containing the dna sequence to identify
# 3 If your program is executed with the incorrect number of command-line arguments, your program should
# print an error message of your choice (with print)

# 4 Your program should open the CSV file and read its contents into memory. |1st row col names| |2nd col STR sequences|
# 5 Program should open and read DNA sequences into memory
# 6 For each of the STRs, program should compute the longest run of consecutive repeats of the
# STR in the DNA sequence to identify.
# 7 If STR counts match exactly print the name of the individual, else print "No match"


# Game plan (use more text-file.txt to read files in command prompt)
# Narrow down by each three types consecutively

# ==================================Program ============================================
import ReadCsvAndTxtFiles
import GetAndCompareDnaData

GetAndCompareDnaData.GetAndCompareDnaData.get_and_compare_data()
# ReadCsvAndTxtFiles.ReadCsvAndTxtFiles.read_dna_csv_and_txt_files()
# ==================================Program ============================================
