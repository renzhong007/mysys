/**
 * Created by toor on 16-12-16.
 */
var translateObj = {
    text:"请给我一杯咖啡!",
    from: "zh",
    to:"mon"
};
function transLate() {
    var text = $("#inputText").val();
    var from = $("#translate_from").val();
    var to = $("#translate_to").val();
    translateObj.text = text;
    translateObj.to = to;
    if (from != "auto") {
        translateObj.from = from;
    }
    console.log(translateObj);
    $.ajax({
        type: 'POST',
        url: "sys/trans",
        data: translateObj,
        success: function (response) {
            //console.log(response.data.mon);
            if (response.status == "ok" && response.data) {
                $("#mon").text(response.data.mon);
            } else {
                console.error("发生错误！");
            }
        },
        dataType: "json"
    });
}


function initEvent() {
    var translatedResultDiv = $("#translatedResult").children();
    $("#fanyi_select").on("click", function (event) {
        var target = event.target;
        $(target).parent().children().removeClass("active");
        $(target).addClass("active");
        var index = $(target).index();
        console.log(index);
        translatedResultDiv.removeClass("active");
        translatedResultDiv.eq(index).addClass("active");
    });
    $("#translate_from").on("change", function (event) {
          if(this.value=="zh"){
              $("#translate_to").val("mon");
          }else if(this.value=="mon"){
              $("#translate_to").val("zh");
          }else{
              if (/[\u4e00-\u9fa5]+/.test( $("#inputText").val())) {
                  translateObj.from = "zh";
                  $("#translate_to").val("mon");
              } else {
                  translateObj.from = "mon";
                  $("#translate_to").val("zh");
              }
          }
    });
    $("#inputText").on("keydown", function (event) {
        var inputString = this.value, isAutoDetc;
        isAutoDetc = $("#translate_from").val();
        if (isAutoDetc == "auto") {
            if (/[\u4e00-\u9fa5]+/.test(inputString)) {
                translateObj.from = "zh";
                $("#translate_to").val("mon");
            } else {
                translateObj.from = "mon";
                $("#translate_to").val("zh");
            }
        }
    });
    /*$("#outWrapper").find("button.toggle-btn").text("打开对比");
    $("#outWrapper").on("click", function (event) {
        var target = event.target;
        if ($(target).hasClass("toggle-btn")) {
            if ($(this).hasClass("open-result")) {
                $(this).removeClass("open-result");
                $(target).text("打开对比");
            } else {
                $(this).addClass("open-result");
                $(target).text("关闭对比");
            }
        }
    });*/
}

initEvent();