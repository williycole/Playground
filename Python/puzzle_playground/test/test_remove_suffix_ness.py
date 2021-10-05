import unittest

from puzzle_playground.puzzles.remove_suffix_ness import remove_suffix_ness


class MyTestCase(unittest.TestCase):
    def test_one(self):
        input_data = ["heaviness", "sadness", "softness", "crabbiness", "lightness", "artiness", "edginess"]
        result_data = ["heavy", "sad", "soft", 'crabby', 'light', 'arty', 'edgy']
        number_of_variants = range(1, len(input_data) + 1)

        for variant, word, result in zip(number_of_variants, input_data, result_data):
            with self.subTest(f"variation #{variant}", word=word, result=result):
                self.assertEqual(remove_suffix_ness(word), result,
                                 msg=f'Expected: {result} but got a different word instead.')
