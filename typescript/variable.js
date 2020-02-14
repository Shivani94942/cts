function hello() {
    for (var i = 0; i < 5; i++) {
        console.log(i);
        hi();
        hey(ms);
    }
    hi();
    console.log("outside the loop" + i);
}
function hi() {
    for (var i = 0; i < 4; i++) {
        console.log(i);
    }
}
function hey(msg) {
    console.log("end of " + msg + "th iteration");
}
var ms = [0, 1, 2, 3, 4];
hello();
