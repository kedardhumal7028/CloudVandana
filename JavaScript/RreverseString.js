function reverseWords(sentence) 
{
    return sentence.split(' ').map(word => 
    {
        return word.split('').reverse().join('');
    }).join(' ');
}

const reversedSentence = reverseWords("This is a sunny day");
console.log(reversedSentence);
