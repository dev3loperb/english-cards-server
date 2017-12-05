$("#addWordForm").submit(function(event){
    // cancels the form submission
    event.preventDefault();
    var original = $("#original_word").val();
    var translation = $("#translation").val();
    addWord(original, translation);
});