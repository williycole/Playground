import ReadCsvAndTxtFiles
import re
import operator


class GetAndCompareDnaData:

    @classmethod
    def get_and_compare_data(cls):
        final_result = ""
        # receives all the results from "read_dna_csv_and_txt_files" and splits the results for further processing
        all_results = ReadCsvAndTxtFiles.ReadCsvAndTxtFiles().read_dna_csv_and_txt_files()

        txt_res_list = all_results[0]
        txt_str = str(txt_res_list)
        # print(txt_str)
        csv_results = all_results[1]

        pat = ['AGATC', 'TTTTTTCT', 'AATG', 'TCTAG', 'GATA', 'TATC', 'GAAA', 'TCTG']
        p = re.compile('start(.*?)end')
        res = max([x for p in pat for x in re.findall(r'(({})\2*)'.format(p), txt_str)],
                  key=lambda k: len(k[0]) // len(k[1]))

        dna_seq = res[0]
        KEY_dna_str = res[1]
        VALUE_dna_seq_pat_count = dna_seq.count(KEY_dna_str)
        # print(dna_seq)
        # print(KEY_dna_str)
        # print(VALUE_dna_seq_pat_count)
        print(f"Key {KEY_dna_str}, Value {VALUE_dna_seq_pat_count}\n")

        key, value = KEY_dna_str, str(VALUE_dna_seq_pat_count)
        name_list = []
        for dicts in csv_results:
            print(dicts)
            if key in dicts and value == dicts[key]:
                print(dicts.get("name"))
                name_list.append(dicts.get("name"))
        else:
            print("No match")

        # list of possible matches
        print(name_list)