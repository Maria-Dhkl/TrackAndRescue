function validation() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let phoneNumberOfUser = document.getElementById("personnelNumber").value;
    let phoneNumberOfFamilyMember = document.getElementById("familyMemberNumber").value;

    if(email!=null) {
        emailValidation(email);
    }
    if (password!=null){
        passwordValidation(password);
    }
    if(phoneNumberOfUser!=null){
        phoneNumberValidation(phoneNumberOfUser);
    }
    if(phoneNumberOfFamilyMember!=null){
        phoneNumberValidation(phoneNumberOfFamilyMember);
    }
}
    function emailValidation(email) {
        let mail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        if (email.value.match(mail)) {
            return true;
        } else {
            return false;
        }
    }

    function passwordValidation(password) {
        let pass = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
        if (password.value.match(pass)) {
            return true;
        } else {
            return false;
        }
    }

    function phoneNumberValidation(phoneNumber) {
        let phone = /^\d{10}$/;
        if (phoneNumber.value.match(phone)) {
            return true;
        } else {
            return false;
        }
    }
