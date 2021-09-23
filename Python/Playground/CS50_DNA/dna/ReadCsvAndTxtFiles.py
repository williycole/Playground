import argparse
import csv


class ReadCsvAndTxtFiles(object):

    # class method reads and returns [Person data from csv file] as well as [DNA sequence from txt file]
    @classmethod
    def read_dna_csv_and_txt_files(cls):
        parser = argparse.ArgumentParser(description='Read various dna files')
        parser.add_argument("read_first_file")
        parser.add_argument("read_second_file")
        args = parser.parse_args()

        dna_csv_list_of_dicts = []
        # reads the dna sequence txt file
        with open(args.read_first_file) as dna_csv_reader:
            dna_csv_reader = csv.DictReader(dna_csv_reader)
            for row in dna_csv_reader:
                # print(row)
                dna_csv_list_of_dicts.append(row)

        # reads and stores the data read from the data base files containing dna and person data
        dna_txt_list = []
        with open(args.read_second_file) as dna_txt_reader:
            csv_reader = csv.DictReader(dna_txt_reader)
            for row in dna_txt_reader:
                # print(row)
                dna_txt_list.append(row)

        # return line, dna_txt_list
        # print(dna_txt_list)
        # print(dna_csv_list_of_dicts)
        return dna_txt_list, dna_csv_list_of_dicts
