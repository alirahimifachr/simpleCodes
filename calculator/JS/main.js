var result;
var sy = false;
var op1 = "";
var op2 = "";
var operator = "";

// zad 2 + 2 inja age 0 click shod natije, age ye operator dg zade shod 4 + newValue ... 
// type shodan ham bashe masalan 8 + 5 bad natije 

// ashar ro ezafe konam

// power 2

// power ezafe konam



function numbersButtonP(num){  //inja az arr va while estefade konam 
    if(sy == false){
        op1 = op1.concat(num);
        document.getElementById("entry").value = op1;
    }
    else if(sy == true){
        op2 = op2.concat(num);
        document.getElementById("entry").value = op2;
    }
}   

function mathButtonP(op){
    operator = op;
    sy = true;
    document.getElementById("entry").value = op1 + op ;
}


function equalButtonP(){
    var fOp1 = parseFloat(op1);
    var fOp2 = parseFloat(op2);

    switch(operator){
        case "+":
            result = fOp1 + fOp2;
            document.getElementById("entry").value = result;
            sy = false;
            op1 = result;
            op2 = "";
            break;

        case "-":
            result = fOp1 - fOp2;
            document.getElementById("entry").value = result;
            sy = false;
            op1 = result;
            op2 = "";
            break;
        
        case "/":
            result = fOp1 / fOp2;
            document.getElementById("entry").value = result;
            sy = false;
            op1 = result;
            op2 = "";
            break;

        case "*":
            result = fOp1 * fOp2;
            document.getElementById("entry").value = result;
            sy = false;
            op1 = result;
            op2 = "";
            break;
    }
}

function clearAll(){
    result;
    sy = false;
    op1 = "";
    op2 = "";
    operator = "";
    document.getElementById("entry").value = "0";
}