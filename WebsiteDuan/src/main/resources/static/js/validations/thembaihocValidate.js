$(function () {
    // Initialize form validation on the registration form.
    // It has the name attribute "registration"
    $("form[name='formAddBaiTap']").validate({// validate cho formAddBaiTap
        // Specify validation rules
        rules: {
        	tenbt: {
                required: true,
                minlength: 3,
                maxlength: 100
            },
           
        },
        // Specify validation error messages
        messages: {
        	tenbt: {
                required: "Vui lòng điền mô tả ngắn",
                minlength: "Độ dài mô tả ngắn tối thiểu 3 kí tự",
                maxlength: "Độ dài mô tả ngắn không quá 100 kí tự"
            }

        },
        // Make sure the form is submitted to the destination defined
        // in the "action" attribute of the form when valid
        submitHandler: function (form) {
            form.submit();
        }
    });
});

