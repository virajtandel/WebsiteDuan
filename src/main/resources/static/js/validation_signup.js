$('#password1, #password').on('keyup', function () {
    if ($('#password1').val() == $('#password').val()) {
        $('#message').html('Mật khẩu khớp').css('color', 'green');
    } else 
        $('#message').html('Mật khẩu không khớp').css('color', 'red');
});