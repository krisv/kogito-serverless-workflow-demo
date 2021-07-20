$(document).ready(function() {
    setInterval(function(){ 
        $.ajax({
	        url: "/scores"
	    }).then(function(data) {
	        $('#score').text("Prizes: " + data);
	    });
    }, 1000);
});