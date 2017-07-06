function addWord(original, translation){
    var word = {}
    word['original'] = original
    word['translation'] = translation

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "api/add-word",
        data: JSON.stringify(word),
        success : function(text){
            // TODO: show success message
            if (text == "success"){
                console.log("added")
            }
        },
        error: function(err) {
            // TODO: show error message
            console.log(err.responseText)
        }
    })
}

function fetchAllWords(callback) {
    $.ajax({
        type: "GET",
        url: "api/word-all",
        success: function(response) {
            callback(response)
        }
    })
}