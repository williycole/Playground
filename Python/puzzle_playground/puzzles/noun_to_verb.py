def noun_to_verb(sentence, index):
    """

    :param sentence: str that uses the word in sentence
    :param index:  index of the word to remove and transform
    :return:  str word that changes the extracted adjective to a verb.

    A function takes a `sentence` using the
    vocabulary word, and the `index` of the word once that sentence
    is split apart.  The function should return the extracted
    adjective as a verb.
    """
    no_period = sentence.replace(".", "")
    split_sentence = no_period.split()
    res = split_sentence[index] + "en"
    print(split_sentence[index])
    print(res)
    return res


noun_to_verb('I need to make that bright.', -1)
