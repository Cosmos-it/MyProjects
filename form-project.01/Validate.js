/*The variables with var above are called global. That is because they can be accessed within a
scope of a method.
Using the DOM to create binding using id=firstName
and gets values to store on the right variable
*/
var fName = document.getElementById("firstName");
/*Using the DOM to create binding using id=lastName
and gets values to store on the right variable
*/
var lName = document.getElementById("lastName");
/*Using the DOM to create binding using id=fNameError
This case different because it is going to display a value
fNameError has not been used. It would be used in the future
to make the errors display outside of the input box.
*/
var fNameError = document.getElementById("fNameError");
/*Using the DOM to create binding using id=age
and gets values to store on the right variable
*/
var a = document.getElementById("age");

/*
Counters are used here to determine if all values
are inserted and valid. Otherwise there is a an error handler
and this counters would not add up to three
*/
var counter1 = 0;
var counter2= 0;
var counter3= 0;
var output = document.getElementById("myoutput");
function validateAll() {
  output.innerHTML = "";
  counter1=0;counter2=0;counter3=0;
  var Vfname = fName.value;
  /* This line of code has a bug. When you pass
  any kind of strings it does not throw an error unlike number values
  */
  if (Vfname === "" || isNaN(Vfname) === false) {
    fName.value = "";
    fName.placeholder = "Please enter valid first name.";
    counter1 = 0;
  }
  else {
    counter ++;
  }
  var Vlname = lName.value
  /* This line of code has a bug. When you pass
  any kind of strings it does not throw an error unlike number values
  */
  if (Vlname === "" || isNaN(Vlname)=== false)
  {
    lName.value = "";
    lName.placeholder = "Please enter valid last name.";
    counter2 = 0;
  }
  else{
    counter2++;
  }
  var Va = a.value
  if (Va === "" || !isNaN(Va) === false || Va % 1 != 0) {
    a.value = "";
    a.placeholder = "Please enter valid age.";
    counter3 = 0;
  }
  else{
    counter3++;
  }
  if (counter1+counter2+counter3 === 3) {
    var next_year_age= Va+1;
    var dog_age_multiplier = Va * 7;
    var next_year_dog_age= dog_age_multiplier+1;
    /*Output was instantiated above and it is being used.*/
    output.innerHTML = "It's nice to meet you " + Vfname +" " +Vlname+".<br>";
    output.innerHTML += "This year you are " + Va + " years old. That is " + dog_age_multiplier+" in dog years.<br>";
    output.innerHTML += "Next year you will be " + next_year_age + " or " +next_year_dog_age + " in dog years."
  }
}
