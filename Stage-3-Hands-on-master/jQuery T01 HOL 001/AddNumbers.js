$(document).ready(() => {
  $("#addTwoNumber").click(() => {
    add_two_number();
  });
});

function add_two_number() {
  //get the userInputs
  var number1 = Number($("#number1").val());
  var number2 = Number($("#number2").val());

  //if userInput is blank then provide errorMessage
  if (number1 == "" || number2 == "") {
    $("#messageDiv").css("color", "red");
    $("#messageDiv").text("Please Enter the Values");
  }
  //calculate the sum and display the result
  else {
    let sum = number1 + number2;
    $("#resultText").val(sum);
    $("#messageDiv").css("color", "green");
    $("#messageDiv").text(sum);
  }
}
