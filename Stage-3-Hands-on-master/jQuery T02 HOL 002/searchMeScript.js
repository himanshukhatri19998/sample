$(document).ready(function () {
  $("#par")
    .find("span")
    .hover(
      function () {
        $(this).css("background-color", "bisque");
      },
      function () {
        $(this).css("background-color", "white");
      }
    );

  $("input").change(function () {
    //remove the prev state
    $("#par")
      .children("span")
      .each(function () {
        if ($(this).hasClass("searchedWord")) {
          $(this).removeClass("searchedWord");
        }
      });

    // if search is null then return
    var searchTerm = $(this).val();
    if (searchTerm === "") {
      return;
    }
    // else provide the class
    $("#par")
      .children("span")
      .each(function () {
        var spanText = $(this).text();

        if (spanText.indexOf(searchTerm) != -1) {
          $(this).addClass("searchedWord");
        }
      });
  });
});
