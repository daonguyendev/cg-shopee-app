function loadMore(){
    let amount = document.querySelectorAll(".body-productContainer-product").length;

    $.ajax({
        url: "/load",
        type: "get", //send it through get method
        data: {
            exist: amount
        },
        success: function(response) {
            var row = document.querySelector(".body-productContainer");
            row.innerHTML += response;
        },
        error: function(xhr) {
            //Do Something to handle error
        }
    });
}