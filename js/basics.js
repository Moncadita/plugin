// basics.js

(function($){

	$.fn.moveX = function (speed) {

		var base = $(this);

		base.init = function(){
			base.moveme();
		};

		base.animate({

			marginLeft:'800px',

		},speed);
	};


})(jQuery);

$('.texting').moveX(1000);





