let target = document.querySelector("#dynamic");

let stringArr = ["Learn To HTML", "Learn To Java", "Learn To Javascript"];
let selectString = stringArr[Math.floor(Math.random()*stringArr.length)];
let selectStringArr = selectString.split("");

function randomString(){
    let stringArr = ["Learn To HTML", "Learn To Java", "Learn To Javascript"];
    let selectString = stringArr[Math.floor(Math.random()*stringArr.length)];
    let selectStringArr = selectString.split("");

    return selectStringArr;

}

function resetTyping(){
    target.textContent = "";
    dynamic(randomString());
}

function dynamic(randomArr){
    if(randomArr.length > 0){
        target.textContent += randomArr.shift();
        setTimeout(function(){dynamic(randomArr)},80);
    }else{
        setTimeout(resetTyping, 3000);
    }
}

dynamic(randomString());

//커서 깜빡임 함수
function blink(){
    target.classList.toggle("active");
}
setInterval(blink(),500);

/*
사용된 함수를 정리하자면
querySelector
textContent
shift()
setTimeout
classList.toggle
setInterval()
split()
Math.floor(), Math.random()
length()

*/
