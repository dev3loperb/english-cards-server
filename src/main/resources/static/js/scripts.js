$("#addWordForm").submit(function(event){
    // cancels the form submission
    event.preventDefault();
    submitForm();
});

function submitForm(){
    // Initiate Variables With Form Content
    var originalWord = $("#original_word").val();
    var translation = $("#translation").val();

    $.ajax({
        type: "POST",
        url: "api/add-word",
        data: "originalWord=" + originalWord + "&translation=" + translation,
        success : function(text){
            if (text == "success"){
                formSuccess();
            }
        }
    });
}
function formSuccess(){
    console.log("added")
}