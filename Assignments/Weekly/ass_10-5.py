sentence=input('Enter a sentence ')
words=sentence.split(' ')
length=0
for word in words:
    length+=len(word)
print(length)