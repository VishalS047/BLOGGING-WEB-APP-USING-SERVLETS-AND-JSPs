function doLikePost(pid, uid)
{
    console.log(pid + " , " + uid);
    var d = {
        uid : uid,
        pid : pid,
        operation : 'like'
    };
     $.ajax({
        url: "LikeServlet",
        data : d,
        success: function (data, textStatus, jqXHR) {
            console.log(data);
            if(data.trim()==='true')
            {
                var count = $(".like-counter").html();
                count++;
                $(".like-counter").html(count);
            }
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(data);
        }
     });  
}