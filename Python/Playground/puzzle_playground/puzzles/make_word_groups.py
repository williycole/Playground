def make_word_groups(vocab_words):
    # """

    # :param vocab_words: list of vocabulary words with a prefix.
    # :return: str of prefix followed by vocabulary words with
    #          prefix applied, separated by ' :: '.

    # This function takes a `vocab_words` list and returns a string
    # with the prefix  and the words with prefix applied, separated
    #  by ' :: '.
    # """
    prefix = vocab_words[0]
    prefixed_words = f"{prefix}"

    for index in range(1, len(vocab_words)):
        word = vocab_words[index]
        # print(f"::{prefix}{word}")
        prefixed_words += f" :: {prefix}{word}"
    print(prefixed_words)
    return prefixed_words


make_word_groups(['auto', 'didactic', 'graph', 'mate', 'chrome', 'centric', 'complete',
                  'echolalia', 'encoder', 'biography'])
