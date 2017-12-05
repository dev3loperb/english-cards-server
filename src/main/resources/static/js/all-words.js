function fillWords() {
    fetchAllWords(function(allWords) {
        var newTbody = document.createElement('tbody');
        var oldTbody = document.getElementById('allWordsTable').tBodies[0]
        allWords.forEach(function(word) {
            var tr = document.createElement('TR')
            var tdOriginal = document.createElement('TD')
            var tdTranslation = document.createElement('TD')
            tdOriginal.appendChild(document.createTextNode(word['original']))
            tdTranslation.appendChild(document.createTextNode(word['translation']))
            tr.appendChild(tdOriginal)
            tr.appendChild(tdTranslation)
            newTbody.appendChild(tr)
        })
        oldTbody.parentNode.replaceChild(newTbody, oldTbody)
    })
}