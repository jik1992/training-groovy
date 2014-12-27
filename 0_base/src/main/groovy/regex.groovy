package groovy

def text=""
def map = [:];
new File("test.txt").eachLine { text += it };
def artltic=text;

text.findAll("\\d+").each {
    if (map.containsKey(it)) map.get(it) << it
    else {
        map[it] = [];
        map[it] << it;
    }
}


map.each { k, v ->
    if (v.size() > 2 && k.size() == 15)
        println k.padLeft(12) + ": $v.size"
}

println "第二个版本".center(22, "=")
def wordFrequency = [:]
artltic.tokenize().each { word -> wordFrequency[word] = wordFrequency.get(word, 0) + 1 }

def wordList = wordFrequency.keySet().toList()
wordList.sort { wordFrequency[it] }

wordList[-1..-6].each {word->
    println word.padLeft(12)+":"+wordFrequency[word]
}
println "".center(22, "=")