$("#addWordForm").submit(function(event){
    // cancels the form submission
    event.preventDefault();
    submitForm();
});

function submitForm(){
    // Initiate Variables With Form Content
    var word = {}
    word['original'] = $("#original_word").val();
    word['translation'] = $("#translation").val();

    console.log(JSON.stringify(word))

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "api/add-word",
        data: JSON.stringify(word),
        success : function(text){
            if (text == "success"){
                formSuccess();
            }
        },
        error: function(err) {
            console.log(err.responseText)
        }
    });
}
function formSuccess(){
    console.log("added")
}