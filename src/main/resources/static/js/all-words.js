function fillWords() {
    fetchAllWords(function(allWords) {
        var newTbody = document.createElement('tbody');
        var oldTbody = document.getElementById('allWordsTable').tBodies[0]
        for (var words in allWords) {
            var tr = document.createElement('TR');
            var tdOriginal = document.createElement('TD')
            var tdTranslation = document.createElement('TD')
            tdOriginal.appendChild(document.createTextNode(allWords[words]['original']));
            tdTranslation.appendChild(document.createTextNode(allWords[words]['translation']));
            tr.appendChild(tdOriginal)
            tr.appendChild(tdTranslation)
            newTbody.appendChild(tr);
        }
        oldTbody.parentNode.replaceChild(newTbody, oldTbody)
    })
}