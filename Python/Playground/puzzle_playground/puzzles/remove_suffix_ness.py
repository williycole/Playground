def remove_suffix_ness(word):
    """
    :param word: str of word to remove suffix from.
    :return: str of word with suffix removed & spelling adjusted.

    This function takes in a word and returns the base word with `ness` removed.
    """
    #  # way one --> returns list with modified words
    # no_ness = []
    # for i in word:
    #     if i.endswith("iness"):
    #         no_ness.append(i[:-5] + 'y')
    #     else:
    #         no_ness.append(i.removesuffix('ness'))
    # print(no_ness)
    # return no_ness

    #  # way two --> returns modified word
    new_word = word[:-4]

    if new_word[-1] == 'i':
        new_word = new_word[:-1] + 'y'

    return new_word


remove_suffix_ness(["heaviness", "sadness", "softness", "crabbiness", "lightness", "artiness", "edginess"])
