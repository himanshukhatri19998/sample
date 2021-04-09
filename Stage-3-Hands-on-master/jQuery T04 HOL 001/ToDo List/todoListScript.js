$(document).ready(() => {
  $("#addTaskBtn").click(() => {
    let taskName = $("#taskName").val();
    if (taskName == "") {
      alert("Enter task details!!");
    } else {
      //append the task to Task list
      $("#taskList").append("<br>" + taskName);
      //clear the userInput field
      $("#taskName").val("");
    }
  });
});
