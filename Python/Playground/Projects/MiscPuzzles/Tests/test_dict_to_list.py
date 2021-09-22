import unittest

from Projects.MiscPuzzles.Classes.dict_to_list import dict_to_list


class MyTestCase(unittest.TestCase):

    def test_one(self):
        assert dict_to_list({'a': 1, 'b': 2}) == [["a", 1], ["b", 2]]

    def test_two(self):
        assert dict_to_list({'shrimp': 15, 'tots': 12}) == [["shrimp", 15], ["tots", 12]]

    def test_three(self):
        assert dict_to_list({}) == []


if __name__ == '__main__':
    unittest.main()
