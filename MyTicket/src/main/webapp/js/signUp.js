/**
 * Checking email validations using regex
 */

let mailRegex = /^([a-z \d \.-]+)@([a-z]{2,20}).([a-z]{2,5})([a-z]{2,5})?/;
let user = document.getElementById('sign-up-form-userName');
let email = document.getElementById('sign-up-form-email');
let password = document.getElementById('sign-up-form-password');
let retypedPassword = document.getElementById('sign-up-form-retyped');

document.getElementById("sign-up-form").addEventListener("submit",
	signUpUser);

function signUpUser(event) {

	if ((retypedPassword.value === password.value)
		&& (validateEmail(email.value))) {
		return;

	} else {

		event.preventDefault();

		if (retypedPassword.value !== password.value) {
			retypedPassword.style.border = 'solid 1px red';
			document.getElementById('sign-up-form-retyped-label').style.visibility = 'visible';

		}

		if (!validateEmail(email.value)) {

			email.style.border = 'solid 1px red';
			document.getElementById('sign-up-form-email-label').style.visibility = 'visible';

		}
	}
}

function validateEmail(email) {

	if (mailRegex.test(email)) {

		return true;

	}

	return false;

}