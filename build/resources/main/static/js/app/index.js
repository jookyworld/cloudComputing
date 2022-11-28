var main = {
    init : function () {
        var _this = this;
        $('#btn-add').on('click', function () {
            _this.add();
        });
    },
    add : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val(),
            url1: $('#url1').val(),
            url2: $('#url2').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('기능이 추가됐습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();