
$(document).ready(function() {
	function showSidebar() {
        main.css('width',"91.5%");
		main.css('margin-left',$('.sidebar-nav').width());
	}
	
	function hideSidebar() {
		main.css('margin-left','0');
		main.css('width',"100%");
	}
    // selectors
    var button = $('[data-sidebar-button]');
	var main = $('[data-main]');
    // hide sidebar on load
/*    sidebar.css('margin-left', sidebar.width() * -1 + 'px');
    sidebar.show(0, function() {
        sidebar.css('transition', 'all 0.5s ease');
    });*/
    if(typeof($.cookie('page_status'))=="undefined") {
        $.cookie('page_status',true,{expires: 7}); 
    }
    if ($.cookie('page_status')=='false') {
        hideSidebar();
    } else {
        showSidebar();
    }
    main.show(0, function() {
        main.css('transition', 'all 0.5s ease');
    });
    // toggle sidebar on click
    button.click(function() {
        if ( $.cookie('page_status')=='true') {
            hideSidebar();
			button.toggleClass("icon-chevron-left");
            button.toggleClass("icon-chevron-right");
            $.cookie('page_status',false,{expires: 7}); 
        } else {
            showSidebar();
            button.toggleClass("icon-chevron-left");
            button.toggleClass("icon-chevron-right");
            $.cookie('page_status',true,{expires: 7}); 
        }

        return false;
    });


　  String.prototype.Trim=function(){
　　    return this.replace(/(^\s*)|(\s*$)/g, "");
　  }

});