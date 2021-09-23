import pprint
import argparse
import csv


def read_database_csv():
    csv_list = []
    parser = argparse.ArgumentParser(description='Process some integers.')
    parser.add_argument("read")
    args = parser.parse_args()
    with open(args.read) as dna_csv:
        csv_reader = csv.DictReader(dna_csv)
        for row in dna_csv:
            print(row)
            csv_list.append(row)

    print(csv_list)
# read_database_csv()
